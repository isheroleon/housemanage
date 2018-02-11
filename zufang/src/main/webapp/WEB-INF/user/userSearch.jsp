<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@include file="../../tagDeclare.jsp"%>
<html lang="en">
<head>
<%@include file="../../headDeclare.jsp"%>
</head>

<body>
	<%@include file="../../topDeclare.jsp"%>
	<div class="ch-container">
		<div class="row">
			<%@include file="../../leftDeclare.jsp"%>
			<div id="content" class="col-lg-10 col-sm-10">
				<div>
					<ul class="breadcrumb">
						<li><a href="#">Home</a></li>
						<li><a href="#">user</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 用户
								</h2>
							</div>
							<div style="margin: 20px 10px">
								<form id="searchForm" method="post" action="user/userSearch.do">
									<label style="margin-right: 10px"> 用户名： 
										<input name="userName" type="text" value="${userName}">
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
											<th>密码</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="item" varStatus="index">
											<tr>
												<td class="center">${item.id}</td>
												<td class="center">${item.userName}</td>
												<td class="center">${item.password}</td>
												<td class="center">操作</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<form method="post" id="pageForm" action="user/userSearch.do">
									<input name="userName" type="hidden" value="${userName}">
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
