<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile PAge</title>
</head>
<body bgcolor="#d9a848">

	<h2> Welcome : ${session_name} </h2>
	<h3> Gender : ${session_gender} </h3>
	<h3> City : ${session_city} </h3>

</body>
</html>