<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@include file="../../tagDeclare.jsp"%>
<html lang="en">
<head>
<%@include file="../../headDeclare.jsp"%>
</head>
<script type="text/javascript">
function update(searchHouseId){
	window.location.href="searchHouse/prepareUpdate.do?searchHouseId="+searchHouseId;
}
</script>
<body>
	<%@include file="../../topDeclare.jsp"%>
	<div class="ch-container">
		<div class="row">
			<%@include file="../../leftDeclare.jsp"%>
			<div id="content" class="col-lg-10 col-sm-10">
				<div>
					<ul class="breadcrumb">
						<li><a href="#">Home</a></li>
						<li><a href="#">寻房查询</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 寻房
								</h2>
							</div>
							<div style="margin: 20px 10px">
								<form id="searchForm" method="post"
									action="searchHouse/searchHouseSearch.do">
									<label style="margin-right: 10px"> 
									地址： 
									<input name="sAddress" type="text" value="${sAddress}">
									</label>
									<button type="submit" class="btn btn-purple btn-sm"
										style="margin: 0 10px;">
										<span class="ace-icon fa fa-search icon-on-right bigger-110"></span>查询
									</button>
								</form>
							</div>
							<div class="box-content">
								<table class="table table-striped table-bordered responsive">
									<thead>
										<tr>
											<th>id</th>
											<th>地址</th>
											<th>联系人</th>
											<th>价格</th>
											<th>电话</th>
											<th>方式</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="item" varStatus="index">
											<tr>
												<td class="center">${item.searchHouseId}</td>
												<td class="center">${item.sAddress}</td>
												<td class="center">${item.sContacts}</td>
												<td class="center">${item.sPrice}</td>
												<td class="center">${item.sPhone}</td>
												<td class="center">${item.sType}</td>
												<td class="center">
													<button type="button" class="btn btn-purple btn-sm" onclick="update('${item.searchHouseId}')">
														修改
													</button>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<form method="post" id="pageForm"
									action="searchHouse/searchHouseSearch.do">
									<input name="sAddress" type="hidden" value="${sAddress}">
								</form>
								<page:createPager pageSize="${pageSize}"
									totalPage="${totalPage}" totalCount="${totalCount}"
									curPage="${pageNum}" formId="pageForm" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="../../jsDeclare.jsp"%>
</body>
</html>
