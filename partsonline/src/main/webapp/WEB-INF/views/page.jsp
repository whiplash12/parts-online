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
<meta name="author" content="">

<title>Parts Online - ${title}</title>

<script>
	window.menu='${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Cosmo Theme CSS -->
<link href="${css}/bootstrap-cosmo-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp"%>

	<!-- Page Content -->
	<!-- Loading Home Content -->
	<c:if test="${userClicksHome == true}">
		<%@include file="home.jsp"%>
	</c:if>

	<!-- Loads only when user clicks contact-->
	<c:if test="${userClicksContact == true}">
		<%@include file="contact.jsp"%>
	</c:if>

	<!-- Loads only when user clicks About Us -->
	<c:if test="${userClicksAbout == true}">
		<%@include file="about.jsp"%>
	</c:if>

	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>

	<!-- js file highlight the active menu -->
	<script src="${js}/myapp.js"></script>

</body>

</html>
