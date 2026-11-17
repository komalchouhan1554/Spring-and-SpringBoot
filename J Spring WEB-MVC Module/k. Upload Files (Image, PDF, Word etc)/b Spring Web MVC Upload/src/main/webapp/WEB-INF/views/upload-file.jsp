<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Page</title>
</head>
<body bgcolor="#575d66">
	<form action="uploadFileForm" method="post" enctype="multipart/form-data">
	
		Name: <input type="text" name="name"> <br><br>
		Email: <input type="text" name="email"> <br><br>
		Select Resume: <input type="file" name="resume"><br><br>
		Select Pic: <input type="file" name="profilepic" > <br><br>
		<input type="submit" value = "Upload" >
	</form>

</body>
</html>