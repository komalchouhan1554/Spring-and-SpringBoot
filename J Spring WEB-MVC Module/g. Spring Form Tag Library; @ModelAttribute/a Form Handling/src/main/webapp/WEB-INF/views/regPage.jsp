<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body bgcolor="66BB6A" >
	<h2> Register Here</h2> 
	
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
	
	
</body>
</html>