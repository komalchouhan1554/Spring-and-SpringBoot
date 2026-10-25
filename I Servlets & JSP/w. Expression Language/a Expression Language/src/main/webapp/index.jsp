<%-- 
    Document   : index
    Created on : 25-Jul-2026, 6:01:46 pm
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        ${10+20} <br> <br>
        
        ${10 > 30} <br> <br>
        
        ${10 le 30} <br> <br>
        
        <%
            pageContext.setAttribute("no1",100);
            pageContext.setAttribute("no2",300);
        %>
        
        ${no1+no2} <br> <br>
        
    </body>
</html>
