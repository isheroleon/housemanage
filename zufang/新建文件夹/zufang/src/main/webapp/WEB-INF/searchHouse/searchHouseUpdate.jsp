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
						<li><a href="#">修改寻房信息</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-content">
								<form method="post" action="searchHouse/searchHouseUpdate.do">
								<input type="text" name="searchHouseId" value="${searchHouse.searchHouseId}">
									<div class="input-group col-md-4">
										<label>地址</label> 
										<input type="text" class="form-control" id="sAddress" name="sAddress"  value="${searchHouse.sAddress}">
									</div>
									<div class="input-group col-md-4">
										<label>联系人</label> 
										<input type="text" class="form-control" id="sContacts" name="sContacts"  value="${searchHouse.sContacts}">
									</div>
									<div class="input-group col-md-4">
										<label>价格</label> 
										<input type="text" class="form-control" id="sPrice" name="sPrice"  value="${searchHouse.sPrice}">
									</div>
									<div class="input-group col-md-4">
										<label>电话</label> 
										<input type="text" class="form-control" id="sPhone" name="sPhone"  value="${searchHouse.sPhone}">
									</div>
									<div class="input-group col-md-4">
										<label>方式</label> 
										<input type="text" class="form-control" id="sType" name="sType"  value="${searchHouse.sType}">
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