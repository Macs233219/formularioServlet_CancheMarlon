<%-- 
    Document   : resultado
    Created on : Oct 31, 2024, 1:09:07 PM
    Author     : marlon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tarjeta</title>
        <link rel="stylesheet" href="./styles/formulario.css"/>
    </head>
    <body>
        <div class="header">
        <h1>Tarjeta de Usuario</h1>   
        </div>
        <div class="container">
            <p>Nombre: <strong> ${nombre} </strong> <p/>
            <p>Apellido: <strong> ${apellido} </strong> <p/>
            <p>Correo: <strong> ${correo} </strong> <p/>
            <p>Genero: <strong> ${genero} </strong> <p/>
            <p>Pasatiempos: <strong> ${pasatiempos} </strong> <p/>
            <p>Puesto: <strong> ${puesto} </strong> <p/>
            <p>Ingreso: <strong> ${ingreso} </strong> <p/>
            <p>Foto: <strong> ${foto} </strong> <p/>
            <p>Edad: <strong> ${edad} </strong> <p/>
            <p>Biografía: <strong> ${biografia} </strong> <p/>
        </div>
    </body>
</html>
