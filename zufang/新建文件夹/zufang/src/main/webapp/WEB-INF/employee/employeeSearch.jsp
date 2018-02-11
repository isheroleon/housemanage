<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@include file="../../tagDeclare.jsp"%>
<html lang="en">
<head>
<%@include file="../../headDeclare.jsp"%>
</head>
<script type="text/javascript">
function update(employeeId){
	window.location.href="employee/prepareUpdate.do?employeeId="+employeeId;
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
						<li><a href="#">employee</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 员工
								</h2>
							</div>
							<div style="margin: 20px 10px">
								<form id="searchForm" method="post" action="employee/employeeSearch.do">
									<label style="margin-right: 10px"> 姓名： 
										<input name="eName" type="text" value="${eName}">
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
											<th>姓名</th>
											<th>性别</th>
											<th>年龄</th>
											<th>电话</th>
											<th>工资</th>
											<th>工龄</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="item" varStatus="index">
											<tr>
												<td class="center">${item.employeeId}</td>
												<td class="center">${item.eName}</td>
												<td class="center">${item.eSex}</td>
												<td class="center">${item.eAge}</td>
												<td class="center">${item.ePhone}</td>
												<td class="center">${item.eMoney}</td>
												<td class="center">${item.eWokerAge}</td>
												<td class="center">
													<button type="button" class="btn btn-purple btn-sm" onclick="update('${item.employeeId}')">
														修改
													</button>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<form method="post" id="pageForm" action="employee/employeeSearch.do">
									<input name="eName" type="hidden" value="${eName}">
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
