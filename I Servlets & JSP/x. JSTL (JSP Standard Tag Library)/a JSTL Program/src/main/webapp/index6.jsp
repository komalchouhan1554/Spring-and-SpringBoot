<%--
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
--%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index 6</title>
    </head>
    
    <body>
        <p> <b>Table of 5 :-</b> </p>
   
        <c:forEach begin="1" end="10" var="i">
            ${5*i} <br/>
            
        </c:forEach>
        <br/>
            
        <c:set var="names" value="${['Ajay','Vishal','Komal','Prafull','Ram','Uday']}"/>
        ${names} <br/>
        <c:forEach begin="0" end="5" var="i">
            ${names[i]} <br/>
        </c:forEach>
            
        <br/><br/><br/>
        
        <c:forEach items="${names}" var="name1">
            ${name1} <br/>
        </c:forEach>
    </body>
</html>
