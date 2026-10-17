
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean class="in.beans.Student" id="stdId"/>
<jsp:setProperty property="name" name = "stdId" value="Vishal" />
<jsp:setProperty property="roll" name = "stdId"  value="122" />

<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Directive Tags</title>
	</head>
	<body>
	
	Name: <jsp:getProperty property="name" name="stdId"/>
	Roll NO: <jsp:getProperty property="roll" name="stdId" />
		
	</body>
</html>