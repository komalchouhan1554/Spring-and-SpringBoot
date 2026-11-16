<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Template Page</title>
</head>
	<body>
		
		
		<div style="width:100; float:left;">
			<tiles:insertAttribute name="header1" />
		</div>
		
		
		<div style="width:100%; float:left;">
		
			<div style="width:30%;  float:left;">
				<tiles:insertAttribute name="menubar1" />
			</div>
			
			<div style="width:70%;  float:left;">
				<tiles:insertAttribute name="body1" />
			</div>
		
		</div>
		
		
		<div style="width:100; float:left;">
			<tiles:insertAttribute name="footer1" />
		</div>
		
		
	</body>
</html>