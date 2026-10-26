<%--
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
--%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index 7</title>
    </head>
    
    <body>
      
        <c:set var="names" value="Ajay,Vishal,Komal,Prafull,Ram,Uday"/>
        ${names}<br/> <br/>
        
        <c:forTokens items="${names}" delims="," var="myname">
            ${myname}<br/>
        </c:forTokens>
        
    </body>
</html>
