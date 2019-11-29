<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../../../myheader.jsp"%>

<div
	style="position: absolute; margin: 0px; padding: 0px; border: none; top: 60px; left: 0px; bottom: 0px; *height: expression(eval(document.documentElement.clientHeight-60)); width: 100%;">
	<!-- fixed navigater-->
	<div id="theNavigater">
		<div style="position: absolute; left: 2px; top: 2px;">
			<img src="${ctx }/resources/images/previous.png" id="hiddenNavImg" />
		</div>
		<div class="navTitle">系统导航</div>
				<c:forEach items="${loginUserMenuMap['14']}" var="cur">
					<div id="${cur.name }" class="navTitle2" url="${ctx }/${cur.url}">
						<img src="${ctx }/resources/images/item.png"
							style="vertical-align: middle; width: 20px; height: 20px;" />&nbsp;&nbsp;${cur.name }
					</div>
				</c:forEach>

	</div>
	<div id="theNavigater2">
		<img src="${ctx }/resources/images/next.png" />点击展开导航栏
	</div>

	<div style="margin: 10px 5px 0 195px;">
		<%@ include file="../../../public/hello.jsp"%>

		<c:if test="${param.msg == 1}">
			<div class="lzui-error">操作成功</div>
		</c:if>
			<div class="lzui-tooltips"
				style="margin: 10px; color: #C0392B; font-weight: bold; font-size: 14px;">
				<a style="color: #C0392B;"
					href="${ctx}/web/oa/merchandise/handle/3/2">查看记录</a>
			</div>

		<div class="gridContainer"
			style="width: 99%; margin-left: 0px; margin-top: 15px;">
			<table class="lzzUIGrid">
				<tbody>
					<tr>
						<td class="l-td-toolbar" colspan="7">
							<div class="l-float-left"
								style="font-weight: bold; font-size: 15px; margin-right: 20px;">
								列表</div>
						</td>
					</tr>

					<tr>
						<td class="l-td-header " style="width: 10%;">申请人</td>
						<td class="l-td-header" style="width: 15%;">编号</td>
						<td class="l-td-header" style="width: 20%;">申请时间</td>
						<td class="l-td-header " style="">查看详情</td>
					</tr>
					<c:forEach items="${list}" var="cur">
						<tr>
							<td class="l-td">${AllUsers[cur.empId].name }</td>
							<td class="l-td">${cur.applyCode }</td>
								<td class="l-td">${cur.applyDate }</td>
							<td class="l-td"><a
								href="${ctx }/web/oa/merchandise/handle/halfMerInbound/detail/1?id=${cur.id}">查看详情</a></td>
						</tr>
					</c:forEach>
					<c:if test="${empty list}">
						<tr>
							<td class="l-td-last-right" colspan="7" style="color: red;">
								对不起，目前还没有相关数据。</td>
						</tr>
					</c:if>
				</tbody>
			</table>
		</div>
		<div style="text-align:right">
	    	<div class="pager"></div>
		</div>
	</div>
</div>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resources/mypage/page.css">
<script type="text/javascript" src="${ctx}/resources/mypage/page.js"></script>
<script>
	onload = function() {
	    //用用回调
	    function go(p) {
	    	location.href = '${ctx}/web/oa/merchandise/handle/3/1?curPage=' + p;
// 	        $('.pager').pager(p, pageCount, go);
	    }
	    $('.pager').pager(Number('${page.currentPage}'), Number('${page.pageCount}'), go);
	}
	
	$(function() {
		$('#OA处理').addClass('ui-tabs-current');
		$('#半成品入库处理').addClass('cur');
		$('.navTitle2').click(function() {
			var url = $(this).attr('url');
			if (url)
				document.location.href = url;
		});
	});
	
</script>
</body>
</html>