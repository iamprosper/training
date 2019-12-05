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
        <title>Ajouter un nouvel étudiant</title>
    </head>
    <body>
        <h1>Veuillez remplir les champs suivants</h1>
        <form action="action" method="POST">
            <label for="nom_etudiant">Nom</label>
            <input name="nom_etudiant" type="text"/><br/>
            <label for="nom_filiere">Filière</label>
            <input name="nom_filiere" type="select"/><br/>
            <input type="submit" value="Enregistrer"/>
        </form>
    </body>
</html>
