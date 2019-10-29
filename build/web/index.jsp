<%-- 
    Document   : index
    Created on : 27/10/2019, 15:13:26
    Author     : mfnav
--%>

<%@page import="com.reaper.controlador.ControladorWS"%>
<%@page import="com.reaper.servicio.Espectaculolocalidadescenario"%>
<%@page import="javax.xml.datatype.DatatypeFactory"%>
<%@page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.reaper.servicio.Localidad"%>
<%@page import="com.reaper.servicio.Espectaculo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Espectáculos</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <h1 class="text-center">Espectáculos</h1>
                </div>
                <div class="card-body">
                    <table class="table table-hover table-bordered">
                        <thead>
                            <tr>
                                <th class="text-center">Espectáculo</th>
                                <th class="text-center">Lugar</th>
                                <th class="text-center">Tipo</th>
                                <th class="text-center">Fecha</th>
                                <th class="text-center">Hora</th>
                                <th class="text-center">Acción</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                int esp = 0, espDes, contador = 1;
                                ControladorWS cont = new ControladorWS();
                                List<Espectaculolocalidadescenario> datos = cont.espectaculoCompleto();
                                for (Espectaculolocalidadescenario e : datos) {
                                    if (contador == 1) {
                                        esp = e.getEspectaculoprograma().getEspId().getEspId();
                            %>
                            <tr>
                                <td class="text-center"><%= e.getEspectaculoprograma().getEspId().getEspNombre()%></td>
                                <td class="text-center"><%= e.getEscenario().getEscNombre()%></td>
                                <td class="text-center"><%= e.getEspectaculoprograma().getEspId().getEspTipo()%></td>
                                <td class="text-center"><%= e.getEspectaculoprograma().getEspEscFecha().getDay()%>/<%= e.getEspectaculoprograma().getEspEscFecha().getMonth()%>/<%= e.getEspectaculoprograma().getEspEscFecha().getYear()%></td>
                                <td class="text-center"><%= e.getEspectaculoprograma().getEspEscHora().getHour()%>:<%= e.getEspectaculoprograma().getEspEscHora().getMinute()%></td>
                                <td class="text-center">
                                    <% String url = "localidad.jsp?escId="+ e.getEscenario().getEscId()+"&espNombre="+e.getEspectaculoprograma().getEspId().getEspNombre()+"&espPrecio="+e.getEspectaculoprograma().getEspEscPrecio()+"&espId="+e.getEspectaculoprograma().getEspId().getEspId();%>
                                    <a class="btn btn-danger" href="<%= url %>" >Seleccionar</a>
                                </td>
                            </tr>
                            <%
                                        contador++;
                                    }
                                    if (esp != e.getEspectaculoprograma().getEspId().getEspId()) {
                                        contador = 1;
                                    }
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
