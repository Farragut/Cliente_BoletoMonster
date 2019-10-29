<%-- 
    Document   : datos
    Created on : 28/10/2019, 19:47:54
    Author     : mfnav
--%>

<%@page import="com.reaper.servicio.Formapago"%>
<%@page import="java.util.List"%>
<%@page import="com.reaper.servicio.Espectaculolocalidadescenario"%>
<%@page import="com.reaper.controlador.ControladorWS"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Datos</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card">
                <div class="card-header">
                    <h3 class="text-center">Venta - <%= request.getParameter("espNombre")%> [<%= request.getParameter("locNombre")%>]</h3>
                </div>
                <div class="card-body">
                    <label>Cédula [Vendedor]</label>
                    <input type="number" name="cedVen" class="form-control" pattern = "[0-9]">
                    <br>
                    <label>Cédula [Cliente]</label>
                    <input type="number" name="cedCli" class="form-control" pattern = "[0-9]">
                    <br>
                    <label>Cantidad de Boletos</label>
                    <input type="number" name="canBol" class="form-control" pattern = "[0-9]">
                    <br>
                    <label>Forma de Pago</label>
                    <br>
                    <select class="mdb-select md-form">
                        <option value="" disabled selected>Seleccione el método de pago</option>
                        <%
                            ControladorWS cont = new ControladorWS();
                            List<Formapago> datos = cont.listFormaPago();
                            for (Formapago e : datos) {
                        %>

                        <option value=<%= e.getFpId() %>><%= e.getFpDescripcion() %></option>
                        <% }%>
                    </select>
                    <br>
                    <br>
                    <a href="factura.jsp" class="btn btn-success btn-block">Realizar Compra</a>  
                </div>
            </div>
            <br>
            <a href="index.jsp" class="btn btn-danger btn-block">Salir</a>            
        </div>    
    </body>
</html>
