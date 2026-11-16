<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homee Page</title>
</head>
<body>

	<!-- Bad design pattern if we want to change the content of the header or footer 
	then we need to change to all the pages present across the whole project  -->

	<div
		style="height: 100px; width: 100%; background-color: blue; text-align: center;">
		<h1 style="color: white;">Samay Collection</h1>
	</div>



	<div style="height: 50px; width: 100%; background-color: aqua;">
		<a href="home.jsp">Home</a>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
		<a href="about-us.jsp">About Us</a>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
		<a href="contact-us.jsp">Contact Us</a>

	</div>

	<div style="height: 500px; width: 100%; background-color: orange;">
		<h1>Welcome to Samay Collection</h1>
		<p>This is home page</p>
	</div>

	<div style="height: 100px; width: 100%; background-color: black">
		<h2 style="color: white; text-align: center;">This is footer</h2>
	</div>

</body>
</html>