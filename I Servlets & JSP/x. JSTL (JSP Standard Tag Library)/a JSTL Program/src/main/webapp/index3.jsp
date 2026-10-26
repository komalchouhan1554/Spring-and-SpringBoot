<%--
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
--%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP-Page</title>
    </head>
    
    <body>
        <c:choose>
            <c:when test="${103 == 101}">
                Vishal 
            </c:when>
                
            <c:when test="${103 == 102}">
                Komal 
            </c:when>
                
            <c:when test="${103 == 103}">
                Prafull 
            </c:when>
                
            <c:when test="${103 == 104}">
                Rupesh 
            </c:when>
                
                
            <c:when test="${103 == 105}">
                Sakshi 
            </c:when>
                
            <c:when test="${103 == 106}">
                Uday 
            </c:when>
                
            <c:otherwise>
                    Invalid Roll NO
            </c:otherwise>
                 
        </c:choose>
       
    </body>
</html>
