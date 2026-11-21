<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us Page</title>
</head>
<body bgcolor="#f78bec">


	<a href="home"><spring:message code="menubar_home" /></a> &emsp; &emsp; &emsp; &emsp;
	<a href="aboutUs"><spring:message code="menubar_aboutUs" /></a> &emsp; &emsp; &emsp; &emsp;
	<a href="contactUs"><spring:message code="menubar_contactUs" /></a>

	<hr>

	<h2><spring:message code="contactus_title" /></h2>

	<div style="height: 300px;">
	
		<p><spring:message code="contactus_name" /> : <spring:message code="contactus_namee" /> </p>
		<p><spring:message code="contactus_phoneno" /> : 826XXXX265 </p>
		<p><spring:message code="contactus_email" /> : vishal@gamil.com </p>
		<p><spring:message code="contactus_city" /> : <spring:message code="contactus_city" /> </p>
	
	</div>

	<hr>

	<a href="?language=en">English</a> &emsp; &emsp; &emsp; &emsp;
	<a href="?language=hi">Hindi</a> &emsp; &emsp; &emsp; &emsp;
	<a href="?language=jp">Japanese</a>


	<hr>

</body>
</html>