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
						<li><a href="#">修改楼盘信息</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-content">
								<form method="post" action="build/buildUpdate.do">
								<input type="hidden" name="buildId" value="${build.buildId}">
									<div class="input-group col-md-4">
										<label>位置</label> 
										<input type="text" class="form-control" id="bLlocaltion" name="bLlocaltion"  value="${build.bLlocaltion}">
									</div>
									<div class="input-group col-md-4">
										<label>价格</label> 
										<input type="text" class="form-control" id="bPrice" name="bPrice"  value="${build.bPrice}">
									</div>
									<div class="input-group col-md-4">
										<label>状态</label> 
										<input type="text" class="form-control" id="bStatus" name="bStatus"  value="${build.bStatus}">
									</div>
									<div class="input-group col-md-4">
										<label>电话</label> 
										<input type="text" class="form-control" id="bPhone" name="bPhone"  value="${build.bPhone}">
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