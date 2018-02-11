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
						<li><a href="#">添加员工信息</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-content">
								<form method="post" action="employee/employeeInsert.do">
									<div class="input-group col-md-4">
										<label>姓名</label> 
										<input type="text" class="form-control" id="eName" name="eName"  value="${eName}">
									</div>
									<div class="input-group col-md-4">
										<label>性别</label> 
										<input type="text" class="form-control" id="eSex" name="eSex"  value="${eSex}">
									</div>
									<div class="input-group col-md-4">
										<label>年龄</label> 
										<input type="text" class="form-control" id="eAge" name="eAge"  value="${eAge}">
									</div>
									<div class="input-group col-md-4">
										<label>电话</label> 
										<input type="text" class="form-control" id="ePhone" name="ePhone"  value="${ePhone}">
									</div>
									<div class="input-group col-md-4">
										<label>工资</label> 
										<input type="text" class="form-control" id="eMoney" name="eMoney"  value="${eMoney}">
									</div>
									<div class="input-group col-md-4">
										<label>工龄</label> 
										<input type="text" class="form-control" id="eWokerAge" name="eWokerAge"  value="${eWokerAge}">
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