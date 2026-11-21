<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body bgcolor="#faff9c">

	<a href="home"><spring:message code="menubar_home" /></a> &emsp; &emsp; &emsp; &emsp;
	<a href="aboutUs"><spring:message code="menubar_aboutUs" /></a> &emsp; &emsp; &emsp; &emsp;
	<a href="contactUs"><spring:message code="menubar_contactUs" /></a>

	<hr>

	<h2><spring:message code="home_title"/></h2>

	<div style="height: 300px;"></div>

	<hr>

	<a href="?language=en">English</a> &emsp; &emsp; &emsp; &emsp;
	<a href="?language=hi">Hindi</a> &emsp; &emsp; &emsp; &emsp;
	<a href="?language=jp">Japanese</a>

	<hr>

</body>
</html>