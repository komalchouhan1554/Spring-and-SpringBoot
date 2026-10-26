<%--
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
--%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index 5</title>
    </head>
    
    <body>
        
        <c:catch var="myException">
            <%
                int res = 100/0;
                out.println(res); 
             %>
         
        </c:catch>
        
        <c:if test="${myException != null}">
            
            <p> <b>Exception : </b> ${myException}</p>
            <p> <b>Exception Message :</b> ${myException.message}</p>
        </c:if>
   
        
    </body>
</html>
