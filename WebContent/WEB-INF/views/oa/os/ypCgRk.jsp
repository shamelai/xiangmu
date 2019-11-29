<%@ page language="java" import="java.util.*,java.text.*,com.hj.oa.bean.Role,com.hj.util.*" pageEncoding="utf-8"%>
<%@ include file="../../public/header.jsp" %>



<div style="position:absolute; margin:0px; padding:0px; border:none; top:60px; left:0px; bottom:0px;*height:expression(eval(document.documentElement.clientHeight-60)); width:100%;">
<!-- fixed navigater-->
<div id="theNavigater">
	<div style="position:absolute;left:2px; top:2px;"><img src="${ctx }/resources/images/previous.png" id="hiddenNavImg"/></div>
	<div class="navTitle">系统导航</div>
	
<div class="navTitle2 cur" url="javascript:;"><img src="${ctx }/resources/images/item.png" style="vertical-align:middle;width:20px;height:20px;"/>&nbsp;&nbsp;申请详情</div>
	<div class="navTitle2" url="${ctx }/web/oa/os/wpCgRkList"><img src="${ctx }/resources/images/item.png" style="vertical-align:middle;width:20px;height:20px;"/>&nbsp;&nbsp;返回上级</div>
	</div>
<div id="theNavigater2">
	<img src="${ctx }/resources/images/next.png"/>点击展开导航栏
</div>

<div style="margin: 10px 5px 0 195px;">
	<div style="margin-top:10px;position:relative; line-height:20px; height:22px; border-bottom:1px solid #ccc; width:960px;">
		<div style="width:93px; color:#34495E;border-bottom:2px solid #27AE60; padding-left:10px; font-size:14px; font-weight:bold;">应急药品采购</div>
	</div>
	
	<c:if test="${not empty msg}">
	<div class="lzui-error">${msg }</div>
	</c:if>
	
	<form name="form1" action="${ctx }/web/oa/os/ypRkPl" method="post" onsubmit="return beforeSubmit();">
	<input type="hidden" value="${submitCode}" name="submitCode"/>
	<input type="hidden" value="${sq.id}" name="sqId"/>
	
	<div style="border:1px solid #2191C0; margin-top:10px; width:99%;">
	<div class="main-header" id="id1">
		<span style="color:#eee;">${compName }应急药品采购申请单</span>
	</div>
	<div class="tableTitle" style="padding:10px 20px;">
		<span>
		<img src="${ctx }/resources/images/communication.gif"/>&nbsp;&nbsp;&nbsp;&nbsp;
		基本信息</span>
	</div>
	<table class="table1" ><tbody>
		<tr>
			<td class="title" style="width:120px;">申领人：</td>	
			<td style="width:90px;">
				${sq.proposerName }
			</td>	
			<td class="title" style="width:120px;">所属部门：</td>	
			<td style="width:90px;">
				${AllDepts[propEmp.deptId].name }
			</td>
			<td class="title" style="width:120px;">申请时间：</td>
			<td style="border-right:none;">
				${sq.createTime }
			</td>	
			
		</tr>
		
	</tbody></table>
	
	<div class="tableTitle" style="padding:10px 20px;">
		<span>
		<img src="${ctx }/resources/images/communication.gif"/>&nbsp;&nbsp;&nbsp;&nbsp;
		采购药品</span>
	</div>
	
	<table class="table1" id='cdTable' ><tbody>
		<tr>
			<td class="title" style="text-align:left; width:20px;">
				<input type="checkbox" id="checkAll"/>
			</td>
			<td class="title" style="text-align:left; width:120px;">
				药品名称 
			</td>
			<td class="title" style="text-align:left; width:120px;">
				规格型号
			</td>
			<td class="title" style="text-align:left; width:100px; ">
				数量单位
			</td>
			<td class="title" style="text-align:left; width:100px; ">
				单价（元）
			</td>
			<td class="title" style="text-align:left; border-right:none; ">
				操作
			</td>
		</tr>
		<c:forEach items="${list }" var="cur">
		<tr>
			<td>
				<c:if test="${cur.cgStatus==0}">
				<input class="wpids" type="checkbox" name="wpId" value="${cur.id }"/>
				</c:if>
			</td>
			<td style="">
				${cur.name }
			</td>
			<td style="">
				${cur.type }
			</td>
			<td style="">
				${cur.num }${cur.unit }
			</td>
			<td style="">
				${cur.money}
			</td>
			<td style=" border-right:none; ">
			
			<c:if test="${cur.cgStatus==0}">
				
				<a style="color:green;" href="javascript:rk(${cur.id},'${cur.name }');">入库</a>
				&nbsp;|
				<a style="color:red;" href="javascript:brk(${cur.id},'${cur.name }');">不入库</a>
				<input id="bz${cur.id}" placeholder="不入库请填写原因" style="width:150px;"/>
			</c:if>
			
			
			<c:if test="${cur.cgStatus==1}">
				<span style="color:green;">已入库</span>
			</c:if>
			<c:if test="${cur.cgStatus == -1}">
				<span style="color:green;">不入库</span>
				（原因：${cur.bz }）
			</c:if>
			</td>	
		</tr>
		</c:forEach>
		
		
	</tbody></table>
	
	
	<div class="tableTitle" style="padding:10px 20px;">
		<span>
		<img src="${ctx }/resources/images/communication.gif"/>&nbsp;&nbsp;&nbsp;&nbsp;
		审批记录</span>
	</div>
	
	<table class="table1" ><tbody>
		<tr>
			
			<td style=" width:16%; ">
				主管意见
				<c:if test="${ not empty sq.mgrId }">
					<span style="color:red;">（${AllUsers[sq.mgrId].name}）</span>
				</c:if>
			</td>
			<td style=" width:16%; color:red;">
			
				<c:choose>
				<c:when test="${ empty sq.mgrId }">
					<span style=" color:#666;" >本次审批不需要经过主管</span>
				</c:when>
				<c:when test="${ sq.currentId == sq.mgrId && sq.status == 1}">
					<span style=" color:#green;" >正在审批</span>
				</c:when>
				<c:otherwise>
					${ empty sq.mgrCmt ? '暂未到达该流程' : sq.mgrCmt  }
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
					<span style=" color:#666;" >本次审批不需要经过主管</span>
				</c:when>
				<c:when test="${ sq.currentId == sq.caiwuId && sq.status == 2}">
					<span style=" color:#green;" >正在审批</span>
				</c:when>
				<c:otherwise>
					${ empty sq.caiwuCmt ? '暂未到达该流程' : sq.caiwuCmt  }
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
				<c:when test="${ sq.currentId == sq.bossId && sq.status == 3}">
					<span style=" color:green;" >正在审批</span>
				</c:when>
				<c:otherwise>
					${ empty sq.bossCmt ? '暂未到达该流程' : sq.bossCmt  }
				</c:otherwise>
				</c:choose>
				
			</td>
		</tr>
	</tbody></table>
	
	
	
	
	</div>
	

	<div class="" style="margin-top:10px; margin-bottom:20px;">
		<a href="javascript:submitForm();" class="lzui-btn lzui-corner-all">批量入库</a>
	</div>
	
	</form>
	</div>
	
			<form name="rkForm" action="${ctx }/web/oa/os/ypRk" method="post">
				<input type="hidden" name="wpId" id="wpId"/>
				<input type="hidden" name="sqId" value="${sq.id }"/>
				<input type="hidden" name="cgStatus" id="cgStatus" />
				<input type="hidden" name="bz" id="bz" />
			</form>
</div>

</body>
</html>
<script>
var index;

$(function(){
	$('#资产管理').addClass('ui-tabs-current');	
	
	$('.navTitle2').click(function(){
		var url = $(this).attr('url');
		if(url)
			document.location.href=url;
	});

	$('#checkAll').click(function(){
		var flag = $(this).prop('checked');

		$('.wpids').prop('checked',flag);
	});
	
});

function beforeSubmit(){
	var wps = $('.wpids:checked');
	var len = wps.length;
	
	if(len<1){
		alert('请选择批量入库物品');
		return false;
	}
		
	return true;
}

function rk(id, name){

	var flag = confirm("您确定入库[" + name + "]？");
	if(!flag){
		return;
	}

	$('#wpId').val(id);
	$('#cgStatus').val('1');
	document.rkForm.submit();
}

function brk(id,name){

	var flag = confirm("您确定不入库[" + name + "]？");
	if(!flag){
		return;
	}

	$('#cgStatus').val('-1');

	var bz = $('#bz'+id).val();
	if(!bz){
		alert("请填写不入库原因。");
		return;
	}
	
	$('#wpId').val(id);
	$('#bz').val(bz);
	document.rkForm.submit();
}

function submitForm(){

	var flag = beforeSubmit();
	if(flag){
		document.form1.submit();
	}
}
</script>