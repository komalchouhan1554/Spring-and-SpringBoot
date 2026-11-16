<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Template Page</title>
</head>
	<body>
		
		<tiles:insertAttribute name="header1" />
		
		<tiles:insertAttribute name="menubar1" />
		
		<tiles:insertAttribute name="body1" />
		
		<tiles:insertAttribute name="footer1" />
		
		
		
	</body>
</html>