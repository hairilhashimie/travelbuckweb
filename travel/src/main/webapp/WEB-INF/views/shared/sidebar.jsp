<h1 class="lead">OUR SERVICES</h1>
<div class="list-group">

	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/show/category/${category.id}/services" class="list-group-item">${category.name}</a>
	</c:forEach>



</div>
