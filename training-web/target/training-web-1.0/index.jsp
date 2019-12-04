<%-- 
    Document   : index.jsp
    Created on : 3 déc. 2019, 20:45:22
    Author     : delaCruz
--%>

<%@page import="tg.ip.net.training.entities.Etudiant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Etudiant</h1>
        
        <%
            out.println(request.getAttribute("listEtudiants"));
        %>
    </body>
</html>
