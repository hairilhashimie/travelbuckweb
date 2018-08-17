<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="Hairil Hashimie" content="">

<title>TravelBuck - ${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap theme CSS -->
<link href="${css}/bootstraptheme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>


		<!-- Page Content -->

		<div class="context">

			<c:if test="${userClickHome ==  true }">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Loading about -->
			<c:if test="${userClickAbout ==  true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Loading contact -->
			<c:if test="${userClickContact ==  true }">
				<%@include file="contact.jsp"%>
			</c:if>

			<!-- Loading up  -->
			<c:if
				test="${userClickAllServices ==  true or userClickCategoryServices == true}">
				<%@include file="listServices.jsp"%>
			</c:if>

		</div>

		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>



		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.min.js"></script>

		<!-- Selcoding javascript -->
		<script src="${js}/myapp.js">
		</script>
	</div>
</body>

</html>
