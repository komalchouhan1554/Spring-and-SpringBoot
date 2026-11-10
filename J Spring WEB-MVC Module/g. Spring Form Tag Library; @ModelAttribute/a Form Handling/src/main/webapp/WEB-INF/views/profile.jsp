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
	
	<h3>Name : ${model_name.getName()}</h3>
	<h3>Email : ${model_name.getEmail()}</h3>
	<h3>Password : ${model_name.getPassword()}</h3>
	<h3>Gender : ${model_name.getGender()}</h3>
	<h3>City : ${model_name.getCity()}</h3>
	
	
</body>
</html>