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
        
        <c:set var="rollNumber" value="${['101','102','103','104','105','106']}" />
        <c:set var="names" value="${['Ajay','Vishal','Komal','Prafull','Ram','Uday']}"/>
        
        <c:set var="rollNo" value="103"/>
        
        <c:choose>
            <c:when test="${rollNo == rollNumber[0]}">
                ${names[0] }
            </c:when>
            
            <c:when test="${rollNo == rollNumber[1]}">
                ${names[1] } 
            </c:when>
                
            <c:when test="${rollNo == rollNumber[2]}">
                ${names[2] } 
            </c:when>
                
            <c:when test="${rollNo == rollNumber[3]}">
                ${names[3] }
            </c:when>
                
            <c:when test="${rollNo == rollNumber[4]}">
                ${names[4] } 
            </c:when>
                
                
            <c:when test="${rollNo == rollNumber[5]}">
                ${names[5]} 
            </c:when>
                
            <c:when test="${rollNo == rollNumber[6]}">
                ${names[6]}  
            </c:when>
                
            <c:otherwise>
                    Invalid Roll NO
            </c:otherwise>
                 
        </c:choose>
       
    </body>
</html>
