<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@include file="tagDeclare.jsp"%>
<html lang="en">
<head>
<%@include file="headDeclare.jsp"%>
</head>
<body>
	<div class="ch-container">
		<div class="row">		
			<div class="row">
				<div class="col-md-12 center login-header">
					<h2>李阳房屋中介系统</h2>
				</div>
			</div>			
			<div class="row">
				<div class="well col-md-5 center login-box">				
					<div class="alert alert-info">请输入用户名和密码</div>					
					<form class="form-horizontal" action="login/login.do" method="post">
						<fieldset>						
							<div class="input-group input-group-lg">
								<span class="input-group-addon">
								<i class="glyphicon glyphicon-user red"></i>
								</span> 
								<input type="text" class="form-control" placeholder="Username" name="userName" id="userName">
							</div>							
							<div class="clearfix"></div>
							<br>
							<div class="input-group input-group-lg">
								<span class="input-group-addon">
								<i class="glyphicon glyphicon-lock red"></i>
								</span> 
								<input type="password" class="form-control" placeholder="Password" name="password" id="password">
							</div>							
							<div class="clearfix"></div>
							<div class="clearfix"></div>
							<p class="center col-md-5">
								<button type="submit" class="btn btn-primary">Login</button>
							</p>							
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
<%@include file="jsDeclare.jsp"%>
</body>
</html>
