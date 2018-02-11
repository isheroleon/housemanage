<%@page language="java" contentType="text/html; charset=utf-8"%>
<div class="col-sm-2 col-lg-2">
	<div class="sidebar-nav">
		<div class="nav-canvas">
			<div class="nav-sm nav nav-stacked"></div>
			<ul class="nav nav-pills nav-stacked main-menu">
				<c:forEach items="${sessionScope.menuList}" var="item" varStatus="index">
					<li class="nav-header">${item.name}</li>
					<c:forEach items="${item.funs}" var="fun" varStatus="index">
						<li>
							<a class="ajax-link" href="${pageContext.request.contextPath }${fun.uri}">
								<span> ${fun.name}</span> 
							</a>
						</li>
					</c:forEach>
				</c:forEach>
			</ul>
		</div>
	</div>
</div>