<%-- 
    Document   : resultado
    Created on : 12 de abr. de 2023, 19:26:07
    Author     : QI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Formulário</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <h1>Respostas</h1>
        <label for="data">Data:</label>
        <input type="date" id="data" value="<%= request.getAttribute("data") %>" readonly><br><br>
        
        <label for="idade">Faixa etária:</label>
        <input type="text" id="idade" value="<%= request.getAttribute("idade") %>" readonly><br><br>
        
        <label for="turnos"> Turnos:</label>
        <textarea id="turnos" cols="10" rows="5"  readonly><%= request.getAttribute("turnos") %>"</textarea><br><br>
        
        <label for="descricao"> Descrição:</label>
        <textarea id="descricao" cols="40" rows="5"  readonly><%= request.getAttribute("descricao") %>"</textarea><br><br>
        
    </body>
</html>
