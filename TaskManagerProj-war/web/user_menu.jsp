<%-- 
    Document   : Admin_menu
    Created on : Sep 11, 2021, 4:30:48 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> User </title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf" %>
        
        
        <h3>User menu page</h3>
        <form method="GET" action="LogoutServlet">
            <input type="submit" value="Выйти" name="logout" />  
        </form>
        
        
        
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
