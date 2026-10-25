<%-- 
    Document   : first.jsp
    Created on : 25-Jul-2026, 6:14:59 pm
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
        <%-- Instead of using these 
         
        <%
            String name = request.getParameter("myname1");
            out.println(name);
        
        %>
         --%>
        
         <%-- We use --%>
         1: ${param.myname1} <br/> <br/> 
         
        <%
            request.setAttribute("req_name","Vj");
            
        %>
         2: ${requestScope.req_name}
         
    </body>
</html>
