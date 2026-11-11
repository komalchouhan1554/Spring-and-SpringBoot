<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<style type="text/css">
	.error_design
	{
		color: red;
	}
</style>

</head>
<body bgcolor="66BB6A" >
	<h2> Register Here</h2> 
	
	<form:form action="regForm" method= "Post" modelAttribute="modelStd">
	
		Name : <form:input path="name"/> <form:errors path="name" cssClass="error_design" /><br><br>
		Email : <form:input path="email"/> <form:errors path="email" cssClass="error_design"/> <br><br>
		Password : <form:password path="password"/> <form:errors path="password" cssClass="error_design" /> <br><br>
		Gender : <form:radiobutton path="gender" label="Male" value="Male"/> <form:radiobutton path="gender" label="Female" value="Female"/> <form:errors path="gender" cssClass="error_design" /> <br><br>
		City : <form:select path="city">
					
					<form:option value="" label="Select City" />
					<form:option value="Ujjain" label="Ujjain" />
					<form:option value="Indore" label="Indore" />
					<form:option value="Pune" label="Pune" />
				</form:select>
				
				<form:errors path="city" cssClass="error_design" />
				
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