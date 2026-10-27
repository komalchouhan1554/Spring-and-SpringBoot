<%@page import="in.models.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Profile Page</title>
	</head>
	<body style="background-color:lime ">
	
		<%
			User user =  (User) session.getAttribute("session_user");
			
			String name = user.getName();
			String email = user.getEmail();
			String city = user.getCity();
		
		%> 
	
		<h3> Welcome : <%= name %></h3>
		<h3> Email : <%= email %></h3>
		<h3> City : <%= city %></h3>
		
		<a href="logout">Logout</a>
	</body>
</html>