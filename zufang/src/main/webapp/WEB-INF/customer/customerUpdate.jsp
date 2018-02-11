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
						<li><a href="#">修改客户信息</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-content">
								<form method="post" action="customer/customerUpdate.do">
								<input type="hidden" name="customerId" value="${customer.customerId}">
									<div class="input-group col-md-4">
										<label>姓名</label> 
										<input type="text" class="form-control" id="cName" name="cName"  value="${customer.cName}">
									</div>
									<div class="input-group col-md-4">
										<label>性别</label> 
										<input type="text" class="form-control" id="cSex" name="cSex"  value="${customer.cSex}">
									</div>
									<div class="input-group col-md-4">
										<label>邮箱</label> 
										<input type="text" class="form-control" id="cEmail" name="cEmail"  value="${customer.cEmail}">
									</div>
									<div class="input-group col-md-4">
										<label>电话</label> 
										<input type="text" class="form-control" id="cPhone" name="cPhone"  value="${customer.cPhone}">
									</div>
									<button type="submit" class="btn btn-default">确认</button>
								</form>
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