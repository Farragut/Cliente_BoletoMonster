<%-- 
    Document   : localidad
    Created on : 28/10/2019, 14:44:11
    Author     : mfnav
--%>

<%@page import="com.reaper.servicio.Cliente"%>
<%@page import="com.reaper.servicio.Vendedor"%>
<%@page import="com.reaper.servicio.Formapago"%>
<%@page import="com.reaper.servicio.Espectaculolocalidadescenario"%>
<%@page import="com.reaper.controlador.ControladorWS"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <title>Localidades</title>
    </head>
    <body>
        <form action="factura.jsp" method="POST">
            <div class="container mt-4">
                <div class="card">
                    <div class="card-header">
                        <h1 class="text-center">Localidades - <%= request.getParameter("espNombre")%> </h1>
                    </div>
                    <div class="card-body">
                        <div class="container mt-4 col-lg-4">
                            <div class="card">
                                <div class="card-body">
                                    <label>Vendedor</label>
                                    <br>
                                    <select id="optVen" name="optVen" class="form-control">
                                        <option value="" disabled selected>Seleccione el vendedor</option>
                                        <%
                                            ControladorWS cont = new ControladorWS();
                                            List<Vendedor> datosVen = cont.listVendedor();
                                            for (Vendedor e : datosVen) {
                                        %>

                                        <option value=<%= e.getVenId()%>><%= e.getVenNombre()%></option>
                                        <% }%>
                                    </select>
                                    <br>
                                    <label>Cliente</label>
                                    <br>
                                    <select id="optCli" name="optCli" class="form-control">
                                        <option value="" disabled selected>Seleccione el cliente</option>
                                        <%
                                            List<Cliente> datosCli = cont.listCliente();
                                            for (Cliente e : datosCli) {
                                        %>

                                        <option value=<%= e.getCliId()%>><%= e.getCliNombre()%></option>
                                        <% }%>
                                    </select>
                                </div>
                            </div>
                        </div>
                        </br>
                        </br>
                        <table class="table table-hover table-bordered">
                            <thead>
                                <tr>
                                    <th class="text-center">Localidad</th>
                                    <th class="text-center">Precio</th>
                                    <th class="text-center">Disponibles</th>
                                    <th class="text-center">Escenario</th>
                                    <th class="text-center">Fecha</th>
                                    <th class="text-center">Hora</th>
                                    <th class="text-center">Cantidad</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    int espId = 0, escId = 0;
                                    List<Espectaculolocalidadescenario> datosEE = cont.localidadCompleto(Integer.parseInt(request.getParameter("espId")), Integer.parseInt(request.getParameter("escId")));
                                    int contTxt = 0;
                                    for (Espectaculolocalidadescenario e : datosEE) {
                                        if (e.getLocEscCapacidad() > 0) {
                                            contTxt++;
                                            espId = e.getEspectaculoprograma().getEspId().getEspId();
                                            escId = e.getEscenario().getEscId();
                                %>
                                <tr>
                                    <input value="<%= e.getLocalidad().getLocId() %>" type="number" id="locId<%= contTxt %>" name="locId<%= contTxt %>" hidden="">
                                    <td class="text-center"><%= e.getLocalidad().getLocNombre()%></td>
                                    <td class="text-center"> $ <%= e.getLocEscPrecio() + Float.parseFloat(request.getParameter("espPrecio"))%></td>
                                    <input value="<%= e.getLocEscPrecio() + Float.parseFloat(request.getParameter("espPrecio")) %>" type="number" id="precioLoc<%= contTxt %>" name="precioLoc<%= contTxt %>" hidden="">
                                    <td class="text-center"><%= e.getLocEscCapacidad()%></td>
                                    <td class="text-center"><%= e.getEscenario().getEscNombre()%></td>
                                    <td class="text-center"><%= e.getEspectaculoprograma().getEspEscFecha().getDay()%>/<%= e.getEspectaculoprograma().getEspEscFecha().getMonth()%>/<%= e.getEspectaculoprograma().getEspEscFecha().getYear()%></td>
                                    <td class="text-center"><%= e.getEspectaculoprograma().getEspEscHora().getHour()%>:<%= e.getEspectaculoprograma().getEspEscHora().getMinute()%></td>
                                    <td class="text-center"><input value="0" onKeyDown="return false" class="text-center form-control" type="number" min="0" max=<%= e.getLocEscCapacidad()%> id="<%= contTxt%>" name="<%= contTxt%>"></td>
                                </tr>
                                <%} }%>
                            <input value="<%= contTxt%>" type="number" id="contTxt" name="contTxt" hidden="">
                            <input value="<%= espId %>" type="number" id="espId" name="espId" hidden="">
                            <input value="<%= escId %>" type="number" id="escId" name="escId" hidden="">
                            </tbody>
                        </table>
                        <a href="#" class="btn btn-success" style="margin-left: 45%;" data-toggle="modal" data-target="#exampleModal">Continuar</a>  
                    </div>
                </div>
                </br>
                </br>
                </br>
                <a href="index.jsp" class="btn btn-success">Regresar</a>
            </div>

            <!-- Modal -->

            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Confirmar Compra</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <label>Forma de Pago</label>
                            <br>
                            <select id="optfp" name="optfp" class="form-control">
                                <option value="" disabled selected>Seleccione el método de pago</option>
                                <%
                                    List<Formapago> datosfp = cont.listFormaPago();
                                    for (Formapago e : datosfp) {
                                %>

                                <option value=<%= e.getFpId()%>><%= e.getFpDescripcion()%></option>
                                <% }%>
                            </select>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                            <input class="btn btn-success text-white" type="submit" value="Comprar" />
                        </div>
                    </div>
                </div>
            </div>
        </form>

        <script type="text/javascript">
            $('#exampleModal').on('shown.bs.modal', function () {
                $('#myInput').trigger('focus')
            })
        </script>

    </body>
</html>
