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
						<li><a href="#">修改新闻信息</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-content">
								<form method="post" action="news/newsUpdate.do">
								<input type="hidden" name="nwesId" value="${news.nwesId}">
									<div class="input-group col-md-4">
										<label>内容</label> 
										<input type="text" class="form-control" id="nContext" name="nContext"  value="${news.nContext}">
									</div>
									<div class="input-group col-md-4">
										<label>标题</label> 
										<input type="text" class="form-control" id="nTitle" name="nTitle"  value="${news.nTitle}">
									</div>
									<div class="input-group col-md-4">
										<label>状态</label> 
										<input type="text" class="form-control" id="nStatus" name="nStatus"  value="${news.nStatus}">
									</div>
									<div class="input-group col-md-4">
										<label>姓名</label> 
										<input type="text" class="form-control" id="nName" name="nName"  value="${news.nName}">
									</div>
									<div class="input-group col-md-4">
										<label>电话</label> 
										<input type="text" class="form-control" id="nPhone" name="nPhone"  value="${news.nPhone}">
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