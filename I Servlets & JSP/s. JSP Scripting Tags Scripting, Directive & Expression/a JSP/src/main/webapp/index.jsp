<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tags</title>
</head>
<body>
	<h3>Welcome to JSP page</h3>
	
	<%! // Declaration Tag
		int rollno = 101;
		String name = "Vishal";
		
		public int add(int a, int b)
		{
			return a+b;
		}
	%>
	
	<% // Scriptlet Tag
	// any java code, logic , method call ,jdbc, request-response, seesion code.
		System.out.print("Hello Vishal");
		
		int no1=10, no2 = 20;
		int sum = no1+no2;
		
		out.println("Sum is: "+ sum);
		
		if(no1>5)
		{
			out.println("true");
		}
		
		for(int i = 1;i<=5;i++)
		{
			out.println(i);
		}
	%>
	
	
	<%= //Expression Tag
	rollno  %>
	<%= name %>
	<%=add(10,55) %>
	<%=LocalTime.now() %>
	<%=Math.random() %>
	
</body>
</html>