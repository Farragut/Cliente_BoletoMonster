<%-- 
    Document   : factura
    Created on : 28/10/2019, 19:04:10
    Author     : mfnav
--%>

<%@page import="com.reaper.servicio.Factura"%>
<%@page import="java.util.List"%>
<%@page import="javax.xml.datatype.DatatypeFactory"%>
<%@page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@page import="java.util.Date"%>
<%@page import="com.reaper.servicio.Espectaculoprograma"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.reaper.servicio.Formapago"%>
<%@page import="com.reaper.servicio.Cliente"%>
<%@page import="com.reaper.servicio.Vendedor"%>
<%@page import="com.reaper.servicio.Escenario"%>
<%@page import="com.reaper.servicio.Espectaculo"%>
<%@page import="com.reaper.servicio.Localidad"%>
<%@page import="com.reaper.controlador.ControladorWS"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Facturación</title>
    </head>
    <body>
        <% ControladorWS cont = new ControladorWS();
            Espectaculo esp = new Espectaculo();
            Escenario esc = new Escenario();
            Vendedor ven = new Vendedor();
            Cliente cli = new Cliente();
            Formapago fp = new Formapago();
            Localidad loc = new Localidad();

            esp = cont.espectaculoById(Integer.parseInt(request.getParameter("espId")));
            esc = cont.escenarioById(Integer.parseInt(request.getParameter("escId")));
            ven = cont.vendedorById(Integer.parseInt(request.getParameter("optVen")));
            cli = cont.clienteById(Integer.parseInt(request.getParameter("optCli")));
            fp = cont.formaPagoById(Integer.parseInt(request.getParameter("optfp")));
        %>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <h3 class="text-center">Facturación </h3>
                </div>
                <div class="card-body">
                    <div class="card card-bodya">
                        <table class="table table-bordered">
                            <tr>
                                <td><span style="font-weight: bold;">Espectáculo: </span> <%= esp.getEspNombre()%></td>
                                <td><span style="font-weight: bold;">Escenario: </span> <%= esc.getEscNombre()%></td>
                            </tr>
                        </table>
                        <table class="table table-bordered">
                            <tr>
                                <td><span style="font-weight: bold;">Vendedor: </span><%= ven.getVenNombre()%></td>
                            </tr>
                            <tr>
                                <td><span style="font-weight: bold;">Cliente: </span> <%= cli.getCliNombre()%></td>
                            </tr>
                            <tr>
                            <table class="table table-bordered">
                                <td><span style="font-weight: bold;">Cédula: </span> <%= cli.getCliCedula()%></td>
                                <td><span style="font-weight: bold;">Dirección: </span> <%= cli.getCliDireccion()%></td>
                            </table>
                            </tr>
                        </table>

                        <table class="table table-bordered">
                            <tr><td><span style="font-weight: bold;">Forma de Pago: </span> <%= fp.getFpDescripcion()%></td></tr>
                        </table>
                    </div>
                </div>
                <table class="table table-hover table-bordered">
                    <thead>
                        <tr>
                            <th class="text-center">Cantidad</th>
                            <th class="text-center">Descripción</th>
                            <th class="text-center">Precio Unitario</th>
                            <th class="text-center">Precio Total</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            float totalCom = 0;
                            int contBol = Integer.parseInt(request.getParameter("contTxt"));
                            for (int i = 1; i <= contBol; i++) {
                                if (!request.getParameter(i + "").equals("0")) {
                                    loc = cont.localidadById(Integer.parseInt(request.getParameter("locId" + i)));
                                    request.getParameter("locId" + i);
                        %>
                        <tr>
                            <td class="text-center"><%= request.getParameter(i + "")%></td>
                            <td class="text-center"><%= loc.getLocNombre()%></td>
                            <td class="text-center">$ <%= Float.parseFloat(request.getParameter("precioLoc" + i))%></td>
                            <td class="text-center">$ <%= Float.parseFloat(request.getParameter("precioLoc" + i)) * Integer.parseInt(request.getParameter("" + i))%></td>
                            <% totalCom += Float.parseFloat(request.getParameter("precioLoc" + i)) * Integer.parseInt(request.getParameter("" + i)); %>
                        </tr>
                        <% }
                            }%>
                    </tbody>
                </table>
                <div class="card-body">
                    <table class="table table-bordered">
                        <% float iva = 0, subtotal = 0;
                            DecimalFormat df = new DecimalFormat("#.##");
                            iva = 0.12f * totalCom;
                            subtotal = totalCom - iva;
                        %>
                        <tr><td><span style="font-weight: bold;">IVA</span></td>  <td class="text-center">$ <%= df.format(iva)%></td></tr>
                        <tr><td><span style="font-weight: bold;">Subtotal</span></td>  <td class="text-center">$ <%= subtotal%></td></tr>
                        <tr><td><span style="font-weight: bold;">Total de Compra </span></td> <td class="text-center">$ <%= totalCom%></td></tr>
                    </table>

                    <button onclick="myFunction()" class="btn btn-success" style="float: right;" >Confirmar Compra</button>
                </div>

            </div>
            <br>
            <a href="index.jsp" class="btn btn-danger">Salir</a>
        </div>
        <script type="text/javascript">
            function myFunction() {
            <%
                int facId = 0;
                cont.escribirFactura(request.getParameter("optCli"), request.getParameter("optfp"), request.getParameter("optVen"));
                List<Factura> lFac = cont.getFactura();
                
                for (Factura e : lFac) {
                    facId = e.getFacId();
                }                
                
                int nuevaCap = 0;
                for (int i = 1; i <= contBol; i++) {
                    if (!request.getParameter(i + "").equals("0")) {
                        nuevaCap = Integer.parseInt(request.getParameter("cap" + i)) - Integer.parseInt(request.getParameter(i + ""));
                        cont.modificarLocalidad(nuevaCap + "", request.getParameter("escId"), request.getParameter("locId" + i), request.getParameter("prog" + i));
                        //escribir detalle
                        cont.insertNewDetalle(facId+"", request.getParameter(i + ""), iva+"", totalCom+"");
                    }
                }

            %>
                alert("Su compra se ha completado satisfactoriamente!");
            }
        </script>                   

    </body>
</html>
