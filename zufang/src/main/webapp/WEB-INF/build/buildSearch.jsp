<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@include file="../../tagDeclare.jsp"%>
<html lang="en">
<head>
<%@include file="../../headDeclare.jsp"%>
</head>
<script type="text/javascript">
	function update(buildId) {
		window.location.href = "build/prepareUpdate.do?buildId="
				+ buildId;
	}
</script>
<body>
	<%@include file="../../topDeclare.jsp"%>
	<div class="ch-container">
		<div class="row">
			<%@include file="../../leftDeclare.jsp"%>
			<div id="content" class="col-lg-10 col-sm-10">
				<div>
					<ul class="breadcrumb">
						<li><a href="#">Home</a></li>
						<li><a href="#">build</a></li>
					</ul>
				</div>
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 楼盘
								</h2>
							</div>
							<div style="margin: 20px 10px">
								<form id="searchForm" method="post"
									action="build/buildSearch.do">
									<label style="margin-right: 10px"> 位置： <input
										name="bLlocaltion" type="text" value="${bLlocaltion}">
									</label>
									<button type="submit" class="btn btn-purple btn-sm"
										style="margin: 0 10px;">
										<span class="ace-icon fa fa-search icon-on-right bigger-110"></span>查询
									</button>
								</form>
							</div>
							<div class="box-content">
								<table class="table table-striped table-bordered responsive">
									<thead>
										<tr>
											<th>id</th>
											<th>位置</th>
											<th>价格</th>
											<th>状态</th>
											<th>电话</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="item" varStatus="index">
											<tr>
												<td class="center">${item.buildId}</td>
												<td class="center">${item.bLlocaltion}</td>
												<td class="center">${item.bPrice}</td>
												<td class="center">${item.bStatus}</td>
												<td class="center">${item.bPhone}</td>
												<td class="center">													
													<button type="button" class="btn btn-purple btn-sm" onclick="update('${item.buildId}')">
														修改
													</button>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<form method="post" id="pageForm" action="build/buildSearch.do">
									<input name="bLlocaltion" type="hidden" value="${bLlocaltion}">
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
