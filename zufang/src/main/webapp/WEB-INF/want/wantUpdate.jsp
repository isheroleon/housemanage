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
						<li><a href="#">修改求租信息</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-content">
								<form method="post" action="want/wantUpdate.do">
								<input type="hidden" name="wantId" value="${want.wantId}">
									<div class="input-group col-md-4">
										<label>地址</label> 
										<input type="text" class="form-control" id="wAddress" name="wAddress"  value="${want.wAddress}">
									</div>
									<div class="input-group col-md-4">
										<label>联系人</label> 
										<input type="text" class="form-control" id="wContacts" name="wContacts"  value="${want.wContacts}">
									</div>
									<div class="input-group col-md-4">
										<label>价格</label> 
										<input type="text" class="form-control" id="wPrice" name="wPrice"  value="${want.wPrice}">
									</div>
									<div class="input-group col-md-4">
										<label>电话</label> 
										<input type="text" class="form-control" id="wPhone" name="wPhone"  value="${want.wPhone}">
									</div>
									<div class="input-group col-md-4">
										<label>押金形式</label> 
										<input type="text" class="form-control" id="wPricetype" name="wPricetype"  value="${want.wPricetype}">
									</div>
									<div class="input-group col-md-4">
										<label>租房方式</label> 
										<input type="text" class="form-control" id="wType" name="wType"  value="${want.wType}">
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