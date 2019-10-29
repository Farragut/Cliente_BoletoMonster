/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reaper.controlador;

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
    
    
}
