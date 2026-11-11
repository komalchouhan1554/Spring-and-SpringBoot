<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body bgcolor="A5D6A7">
	<h2>Profile Page</h2>
	
	<h3>Name : ${modelStd.getName()}</h3>
	<h3>Email : ${modelStd.getEmail()}</h3>
	<h3>Password : ${modelStd.getPassword()}</h3>
	<h3>Gender : ${modelStd.getGender()}</h3>
	<h3>City : ${modelStd.getCity()}</h3>
	
	
</body>
</html>