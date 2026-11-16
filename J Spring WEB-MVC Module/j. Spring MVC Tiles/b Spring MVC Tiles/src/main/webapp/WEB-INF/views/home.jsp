<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

	<!-- Instead of using header and footer in every page we use include tag to add header, footer and manubar  -->

	<jsp:include page="header.jsp" />
	
	<jsp:include page="menubar.jsp" />


	<div style="height: 500px; width: 100%; background-color: orange;">
		<h1>Welcome to Samay Collection</h1>
		<p>This is home page</p>
	</div>
	
	<jsp:include page="footer.jsp" />
</body>
</html>