<div class = "container">
	
	
	<div class = "row">
	
		<!-- Sidebar display -->
		<div class = "col-md-3">
		<%@include file = "./shared/sidebar.jsp" %>
		</div>
	
		<!-- Displaying actual services -->
		<div class = "col-md-4">
		
		
		<!-- Breadcrumb component -->
		<div class="row">
			
			<div class = "col-lg-12">
			<c:if test = "${userClickAllServices == true }">
			<ol class = "breadcrumb">
			
				<li><a href = "${contextRoot}/home">Home</a></li>
				<li class = "active">All Services</li>
			
			</ol>
			</c:if>
			
			
			<c:if test = "${userClickCategoryServices == true }">
			<ol class = "breadcrumb">
			
				<li><a href = "${contextRoot}/home">Home</a></li>
				<li class = "active">Category</li>
				<li class = "active">${category.name}</li>
			
			</ol>
			</c:if>
			
			</div>
		
		
		</div>
		
		
		</div>
	
	
	
	
	
	
	
	
	</div>












</div>