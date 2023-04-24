<%-- 
    Document   : pagina
    Created on : 5 de abr. de 2023, 21:24:09
    Author     : QI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Arrependa-se</title>
        <meta name="description" content= "sua oportunidade de voltar a Cristo">
        <meta name="Keywords" content= "evangelio, jesus, boa noticia, encontro, momento especial">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="https://i.pinimg.com/originals/cf/e6/b8/cfe6b8d1d6cf08994c9d84d6d9003757.png"> 
        
    </head>
    <body>
        <h1>Exemlo do uso de JSP</h1>
        <%--Uso geral--%>
        <% 
           //aqui estamos escrevendo código JAVA
           String x= "<h3>Hello ";
           String y= "JSP!</h3>";
           out.print(x + y);
        %>
        
        <%--declaração--%>
        <%!
            float pi = 3.1415f;
            float raio = 4f;
            float result = pi *(raio * raio);
        %>
        
        <%-- Expressao--%>
        <%="<hr>" + result + "<p>Resultado</p>"%>
    </body>
</html>
