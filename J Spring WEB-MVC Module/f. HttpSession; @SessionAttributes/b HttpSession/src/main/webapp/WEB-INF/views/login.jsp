<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

  
<!-- taglib url= "http://java.sun.com/jsp/jstl/core" prefix = "c" -->


<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body bgcolor="#48d9b0">

	

	<h2>Login Here</h2>
	
	<c:if test="${not empty login_error}" >
		<h3 style="color:red;" > ${login_error}</h3>
	</c:if>
	
	<form action="loginForm" method="post">
		Email Id : <input type="text" name="email1" > <br><br>
		Password : <input type="password" name="pass1" ><br><br>
		
		<input type= "submit" value ="Login" > 
	</form>
</body>
</html>