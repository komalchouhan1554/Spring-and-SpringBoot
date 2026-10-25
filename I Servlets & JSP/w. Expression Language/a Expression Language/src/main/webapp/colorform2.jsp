 <%-- 
    Document   : colorform2
    Created on : 25-Jul-2026, 6:50:54 pm
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
        <b> Welcome: </b> ${param.name1} <br/> <br/>
        <b> Selected Colors : </b> ${paramValues.color1[0]},${paramValues.color1[1]},${paramValues.color1[2]}
    </body>
</html>
