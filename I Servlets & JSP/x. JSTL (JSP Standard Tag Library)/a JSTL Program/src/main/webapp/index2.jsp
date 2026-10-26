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
        <c:if test="${10 < 20}">
                Hello 1
        </c:if>
      
         <br/>
         
        <c:if test="${10 lt 20}">
                Condition 2
        </c:if>
    </body>
</html>
