/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reaper.controlador;

import com.reaper.servicio.Cliente;
import com.reaper.servicio.Escenario;
import com.reaper.servicio.Espectaculo;
import com.reaper.servicio.Espectaculoprograma;
import com.reaper.servicio.Formapago;
import com.reaper.servicio.Localidad;
import com.reaper.servicio.Vendedor;

/**
 *
 * @author mfnav
 */
public class ControladorWS {

    public static java.util.List<com.reaper.servicio.Espectaculolocalidadescenario> espectaculoCompleto() {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.espectaculoCompleto();
    }

    public static java.util.List<com.reaper.servicio.Espectaculolocalidadescenario> localidadCompleto(int espId, int escId) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.localidadCompleto(espId, escId);
    }

    public static java.util.List<com.reaper.servicio.Formapago> listFormaPago() {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.listFormaPago();
    }

    public static java.util.List<com.reaper.servicio.Vendedor> listVendedor() {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.listVendedor();
    }

    public static java.util.List<com.reaper.servicio.Cliente> listCliente() {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.listCliente();
    }

    public static Localidad localidadById(int locId) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.localidadById(locId);
    }

    public static Escenario escenarioById(int escId) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.escenarioById(escId);
    }

    public static Espectaculo espectaculoById(int espId) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.espectaculoById(espId);
    }

    public static Vendedor vendedorById(int venId) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.vendedorById(venId);
    }

    public static Cliente clienteById(int cliId) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.clienteById(cliId);
    }

    public static Formapago formaPagoById(int fpId) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.formaPagoById(fpId);
    }

    public static Espectaculoprograma espProById(int espProId) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.espProById(espProId);
    }

    public static void escribirFactura(java.lang.String cliId, java.lang.String fpId, java.lang.String venId) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        port.escribirFactura(cliId, fpId, venId);
    }

    public static void modificarLocalidad(java.lang.String bolRest, java.lang.String escId, java.lang.String locId, java.lang.String espId) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        port.modificarLocalidad(bolRest, escId, locId, espId);
    }

    public static void insertNewDetalle(java.lang.String facId, java.lang.String bolId, java.lang.String iva, java.lang.String total) {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        port.insertNewDetalle(facId, bolId, iva, total);
    }    

    public static java.util.List<com.reaper.servicio.Factura> getFactura() {
        com.reaper.servicio.WSMiBoleto_Service service = new com.reaper.servicio.WSMiBoleto_Service();
        com.reaper.servicio.WSMiBoleto port = service.getWSMiBoletoPort();
        return port.getFactura();
    }

}
