<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="utf-8"%>
<%@ include file="../../public/header.jsp" %>
<div style="position:absolute; margin:0px; padding:0px; border:none; top:60px; left:0px; bottom:0px;*height:expression(eval(document.documentElement.clientHeight-60)); width:100%;">
<!-- fixed navigater-->
<div id="theNavigater">
	<div style="position:absolute;left:2px; top:2px;"><img src="${ctx }/resources/images/previous.png" id="hiddenNavImg"/></div>
	<div class="navTitle">系统导航</div>
	
	<div class="navTitle2 cur" url="javascript:;"><img src="${ctx }/resources/images/item.png" style="vertical-align:middle;width:20px;height:20px;"/>&nbsp;&nbsp;申请详情</div>
	<div class="navTitle2" url="${ctx }/web/oa/prop/myCgSp"><img src="${ctx }/resources/images/item.png" style="vertical-align:middle;width:20px;height:20px;"/>&nbsp;&nbsp;返回上级</div>
</div>
<div id="theNavigater2">
	<img src="${ctx }/resources/images/next.png"/>点击展开导航栏
</div>

<div style="margin: 10px 5px 0 195px;">
	<div style="margin-top:10px;position:relative; line-height:20px; height:22px; border-bottom:1px solid #ccc; width:960px;">
		<div style="width:93px; color:#34495E;border-bottom:2px solid #27AE60; padding-left:10px; font-size:14px; font-weight:bold;">资产采购申请</div>
	</div>
	
	<c:if test="${not empty msg}">
	<div class="lzui-error">${msg }</div>
	</c:if>
	
	<form name="form1" action="${ctx }/web/asset/approval" method="post" onsubmit="return beforeSubmit();">
	<input type="hidden" value="${submitCode}" name="submitCode"/>
	<input type="hidden" value="${record.id}" name="recordId"/>
	<div style="border:1px solid #2191C0; margin-top:10px; ">
	<div class="main-header" id="id1">
		<span style="color:#eee;">${compName }固定资产采购申请单</span>
	</div>
	<div class="tableTitle" style="padding:10px 20px;">
		<span>
		<img src="${ctx }/resources/images/communication.gif"/>&nbsp;&nbsp;&nbsp;&nbsp;
		基本信息</span>
	</div>
	<table class="table1" ><tbody>
		<tr>
			<td class="title" style="width:100px;">申请人：</td>	
			<td style="width:120px;">
				${record.applyer }
			</td>	
			<td class="title" style="width:100px;">所属部门：</td>	
			<td style="width:90px;">
				${record.deptId }
			</td>
			<td class="title" style="width:100px;">申请时间：</td>
			<td style="border-right:none;">
				${record.applyTime }
			</td>	
			
		</tr>
		
	</tbody></table>
	
	<div class="tableTitle" style="padding:10px 20px;">
		<span>
		<img src="${ctx }/resources/images/communication.gif"/>&nbsp;&nbsp;&nbsp;&nbsp;
		采购资产</span>
	</div>
	
	<table class="table1" id='cdTable' ><tbody>
		<tr>
			<td class="title" style="text-align:left; width:160px;">
				资产名称 
			</td>
			<td class="title" style="text-align:left; width:450px;">
				备注信息（如：规格型号、配置等）
			</td>
			<td class="title" style="text-align:left; width:60px;">
				单位
			</td>
			<td class="title" style="text-align:left; width:60px;">
				单价
			</td>
			<td class="title" style="text-align:left; width:60px;">
				数量
			</td>
			<td class="title" style="text-align:left; width:100px;color:red;">
				预算资金(元)
			</td>
		</tr>
		<c:forEach items="${details}" var="detail">
		<tr>
			<td style="">
				${detail.name }
			</td>
			<td style="">
				无
			</td>
			<td>
				${detail.unit}
			</td>
			<td>
				${detail.price }元
			</td>
			<td>
				${detail.num }
			</td>
			<td>
				<span class="jrc">${detail.price * detail.num }</span>元
			</td>
		</tr>
		</c:forEach>
		
		<c:if test="${sq.status>2}">
		<tr style="color:red;font-weight:bold;">
			<td style="">
				金额总计
			</td>
			<td>
				<span id="zjje">1000</span>元
			</td>
		</tr>	
		</c:if>
	</tbody></table>
	
	<div class="tableTitle" style="padding:10px 20px;">
		<span>
		<img src="${ctx }/resources/images/communication.gif"/>&nbsp;&nbsp;&nbsp;&nbsp;
		采购事由</span>
	</div>
	
	<table class="table1" ><tbody>
		<tr>
			<td  style="border-right:none; ">
				<textarea name="content" id="cnt" disabled style="width:50%; height:80px; padding:5px 10px;">${record.reason}</textarea>
			</td>	
		</tr>
	</tbody></table>
	
	<div class="tableTitle" style="padding:10px 20px;">
		<span>
		<img src="${ctx }/resources/images/communication.gif"/>&nbsp;&nbsp;&nbsp;&nbsp;
		审批记录</span>
	</div>
	
	<table class="table1" ><tbody>
		<tr>
			
			<td style="width:16%;">
				总监意见
				<c:if test="${ not empty sq.directId }">
					<span style="color:red;">（${AllUsers[sq.directId].name}）</span>
				</c:if>
			</td>
			<td style="width:16%;color:red;">
			
				<c:choose>
				<c:when test="${ empty sq.directId }">
					<span style=" color:#666;" >本次审核不需要经过总监</span>
				</c:when>
				<c:when test="${ sq.currentId == sq.directId && sq.status == 1}">
					<span style=" color: green;" >正在审批</span>
				</c:when>
				<c:otherwise>
					${ empty sq.directCmt ? '暂无' : sq.directCmt  }
				</c:otherwise>
				</c:choose>
				
			</td>
			
			<td style=" width:16%; ">
				财务主管意见
				<c:if test="${ not empty sq.caiwuId }">
					<span style="color:red;">（${AllUsers[sq.caiwuId].name}）</span>
				</c:if>
			</td>
			<td style=" width:16%; color:red;">
			
				<c:choose>
				<c:when test="${ empty sq.caiwuId }">
					<span style=" color:#666;" >本次审批不需要经过财务主管</span>
				</c:when>
				<c:when test="${ sq.currentId == sq.caiwuId && sq.status == 3}">
					<span style=" color:#green;" >正在审批</span>
				</c:when>
				<c:otherwise>
					${ empty sq.caiwuCmt ? '暂无' : sq.caiwuCmt  }
				</c:otherwise>
				</c:choose>
				
			</td>
			
			<td style="width:16%;">
				总经理意见
				<c:if test="${ not empty sq.bossId }">
					<span style="color:red;">（${AllUsers[sq.bossId].name}）</span>
				</c:if>
			</td>
			<td style="width:16%; color:red; border-right:none; ">
			
				<c:choose>
				<c:when test="${ empty sq.bossId }">
					<span style=" color:#666;" >本次审核不需要经过总经理</span>
				</c:when>
				<c:when test="${ sq.currentId == sq.bossId && sq.status == 4}">
					<span style=" color:green;" >正在审批</span>
				</c:when>
				<c:otherwise>
					${ empty sq.bossCmt ? '暂无' : sq.bossCmt  }
				</c:otherwise>
				</c:choose>
				
			</td>
		</tr>
	</tbody></table>
	
	
	<div class="tableTitle" style="padding:10px 20px;">
		<span>
		<img src="${ctx }/resources/images/communication.gif"/>&nbsp;&nbsp;&nbsp;&nbsp;
		审批意见</span>
	</div>
	
	<table class="table1" ><tbody>
		<tr>
			
			<td style="width:320px;">
				审批意见：
				<select id="tg" name="sp" onchange="yjChanged()" >
					<option value="1" style="color:green;" selected="selected">通过</option>
					<option value="0" style="color:red;">不通过</option>
				</select>
			</td>
			
			<td style="border-right:none;">
				补充意见：<input name="yj" id="yj" style="width:180px;" value="ok"/> <span style="color:red;">不超过50个字符</span>
			</td>
		</tr>
	</tbody></table>
	
	</div>
	<div class="" style="margin-top:10px; margin-bottom:20px;">
		<a href="javascript:submitForm();" class="lzui-btn lzui-corner-all">提交审批结果</a>
	</div>
	</form>
	</div>
	
</div>

</body>
</html>
<script>
$(function(){
	$('#OA审批').addClass('ui-tabs-current');
	
	$('.navTitle2').click(function(){
		var url = $(this).attr('url');
		if(url)
			document.location.href=url;
	});

	setjr();
});

function setjr(){
	var zjje = 0.0;
	var al = $('.jrc');
	al.each(function(i){
		zjje += parseFloat($(this).html());
	});
	

	$('#zjje').html(zjje);
}

function beforeSubmit(){
	var tg = $('#tg').val();

	if(tg == '0'){
		alert('请选择审批意见');
		return false;
	}

	var yj = $('#yj').val();	
	yj = $.trim(yj);
	if(!yj){
		alert('请输入补充意见');
		return false;
	}
		
	return true;
}

function submitForm(){

	if(flag){
		document.form1.submit();
	}
}
</script>