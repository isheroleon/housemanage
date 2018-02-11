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
						<li><a href="#">修改员工信息</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-content">
								<form method="post" action="employee/employeeUpdate.do">
								<input type="hidden" name="employeeId" value="${employee.employeeId}"/>
									<div class="input-group col-md-4">
										<label>姓名</label> 
										<input type="text" class="form-control" id="eName" name="eName"  value="${employee.eName}">
									</div>
									<div class="input-group col-md-4">
										<label>性别</label> 
										<input type="text" class="form-control" id="eSex" name="eSex"  value="${employee.eSex}">
									</div>
									<div class="input-group col-md-4">
										<label>年龄</label> 
										<input type="text" class="form-control" id="eAge" name="eAge"  value="${employee.eAge}">
									</div>
									<div class="input-group col-md-4">
										<label>电话</label> 
										<input type="text" class="form-control" id="ePhone" name="ePhone"  value="${employee.ePhone}">
									</div>
									<div class="input-group col-md-4">
										<label>工资</label> 
										<input type="text" class="form-control" id="eMoney" name="eMoney"  value="${employee.eMoney}">
									</div>
									<div class="input-group col-md-4">
										<label>工龄</label> 
										<input type="text" class="form-control" id="eWokerAge" name="eWokerAge"  value="${employee.eWokerAge}">
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