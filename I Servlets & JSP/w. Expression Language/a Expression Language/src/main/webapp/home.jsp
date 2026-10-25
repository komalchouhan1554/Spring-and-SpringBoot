<%-- 
    Document   : home
    Created on : 25-Jul-2026, 6:41:48 pm
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
        <%  
            String[] str = {"Deepak","Amit","Komal","Vishal"};
            pageContext.setAttribute("name_str", str);
         %>
         
         ${name_str[0]} <br/> 
         ${name_str[1]} <br/> 
         ${name_str[2]} <br/> 
         ${name_str[3]} <br/> 
         
         
    </body>
</html>
