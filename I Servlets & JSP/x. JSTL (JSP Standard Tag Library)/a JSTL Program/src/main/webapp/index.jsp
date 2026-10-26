<%--
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
--%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="name1" value="Vishal Jadhav" />
        
        1: <c:out value= "${name1}" /> <br/>
        2: ${name1}
        
        <c:remove var="name1" />  <br/><br/>
        
        1: <c:out value= "${name1}" /> <br/>
        2: ${name1}
        
    </body>
</html>
