<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@include file="../../tagDeclare.jsp"%>
<html lang="en">
<head>
<%@include file="../../headDeclare.jsp"%>
</head>
<script type="text/javascript">
function update(tenementId){
	window.location.href="tenement/prepareUpdate.do?tenementId="+tenementId;
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
						<li><a href="#">tenement</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 租房
								</h2>
							</div>
							<div style="margin: 20px 10px">
								<form id="searchForm" method="post" action="tenement/tenementSearch.do">
									<label style="margin-right: 10px"> 位置： 
										<input name="tAddress" type="text" value="${tAddress}">
									</label> 
									<button type="submit" class="btn btn-purple btn-sm" style="margin: 0 10px;">
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
											<th>付款方式</th>
											<th>租房方式</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="item" varStatus="index">
											<tr>
												<td class="center">${item.tenementId}</td>
												<td class="center">${item.tAddress}</td>
												<td class="center">${item.tContacts}</td>
												<td class="center">${item.tPrice}</td>
												<td class="center">${item.tPhone}</td>
												<td class="center">${item.tPriceType}</td>
												<td class="center">${item.tType}</td>
												<td class="center">
													<button type="button" class="btn btn-purple btn-sm" onclick="update('${item.tenementId}')">
														修改
													</button>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<form method="post" id="pageForm" action="tenement/tenementSearch.do">
									<input name="tAddress" type="hidden" value="${tAddress}">
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
	</div>
	<%@include file="../../jsDeclare.jsp"%>
</body>
</html>
