<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body bgcolor="66BB6A" >
	<h2> Register Here</h2> 
	
	<form:form action="regForm" method= "Post" modelAttribute="modelStd">
	
		Name : <form:input path="name"/> <br><br>
		Email : <form:input path="email"/> <br><br>
		Password : <form:password path="password"/> <br><br>
		Gender : <form:radiobutton path="gender" label="Male" value="Male"/> <form:radiobutton path="gender" label="Female" value="Female"/> <br><br>
		City : <form:select path="city">
					
					<form:option value="Select City" label="Select City" />
					<form:option value="Ujjain" label="Ujjain" />
					<form:option value="Indore" label="Indore" />
					<form:option value="Pune" label="Pune" />
				</form:select>
				
		<input type = "submit" value ="Register">
	 
	</form:form>
	
	<!-- 
	<form action="regForm" method= "Post">
	
		Name: <input type= "text" name="name1"> <br><br>
		Email: <input type= "text" name="email1"> <br><br>
		Password: <input type= "password" name="pass1"> <br><br>
		Gender: <input type= "radio" name="gender1" value ="male">
		 Male 
		 <input type= "radio" name="gender1" value ="female"> 
		 Female 
		 <br><br>
		
		CIty: <select name="city1">
					<option value="Select City"> Select City </option>
					<option value="Indore"> Indore </option>
					<option value="Delhi"> Delhi </option>
					<option value="Mumbai"> Mumbai </option>
			  </select>
			  
		<input type = "submit" value ="Register">
	
	</form>
	
	 -->
	
	
</body>
</html>