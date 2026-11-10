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
	
	<h3>Name : ${model_std.getName()}</h3>
	<h3>Email : ${model_std.getEmail()}</h3>
	<h3>Password : ${model_std.getPassword()}</h3>
	<h3>Gender : ${model_std.getGender()}</h3>
	<h3>City : ${model_std.getCity()}</h3>
	
	
</body>
</html>