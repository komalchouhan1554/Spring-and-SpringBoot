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
		<input type="file" name="myfile" > <br><br>
		<input type="submit" value = "Upload" >
	</form>

</body>
</html>