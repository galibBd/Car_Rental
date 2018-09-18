<%-- 
    Document   : logout
    Created on : Jul 16, 2018, 1:23:08 AM
    Author     : SAIFUL
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
        session.invalidate();
        response.sendRedirect("login.xhtml");
        %>
    </body>
</html>
