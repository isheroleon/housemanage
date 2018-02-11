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
						<li><a href="#">修改租房信息</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-content">
								<form method="post" action="tenement/tenementUpdate.do">
								<input type="hidden" name="tenementId" value="${tenement.tenementId}">
									<div class="input-group col-md-4">
										<label>地址</label> 
										<input type="text" class="form-control" id="tAddress" name="tAddress"  value="${tenement.tAddress}">
									</div>
									<div class="input-group col-md-4">
										<label>联系人</label> 
										<input type="text" class="form-control" id="tContacts" name="tContacts"  value="${tenement.tContacts}">
									</div>
									<div class="input-group col-md-4">
										<label>价格</label> 
										<input type="text" class="form-control" id="tPrice" name="tPrice"  value="${tenement.tPrice}">
									</div>
									<div class="input-group col-md-4">
										<label>电话</label> 
										<input type="text" class="form-control" id="tPhone" name="tPhone"  value="${tenement.tPhone}">
									</div>
									<div class="input-group col-md-4">
										<label>付款方式</label> 
										<input type="text" class="form-control" id="tPriceType" name="tPriceType"  value="${tenement.tPriceType}">
									</div>
									<div class="input-group col-md-4">
										<label>租房方式</label> 
										<input type="text" class="form-control" id="tType" name="tType"  value="${tenement.tType}">
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