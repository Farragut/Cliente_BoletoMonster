
package com.reaper.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS_MiBoleto", targetNamespace = "http://servicio.reaper.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSMiBoleto {


    /**
     * 
     * @return
     *     returns java.util.List<com.reaper.servicio.Espectaculolocalidadescenario>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "espectaculoCompleto", targetNamespace = "http://servicio.reaper.com/", className = "com.reaper.servicio.EspectaculoCompleto")
    @ResponseWrapper(localName = "espectaculoCompletoResponse", targetNamespace = "http://servicio.reaper.com/", className = "com.reaper.servicio.EspectaculoCompletoResponse")
    @Action(input = "http://servicio.reaper.com/WS_MiBoleto/espectaculoCompletoRequest", output = "http://servicio.reaper.com/WS_MiBoleto/espectaculoCompletoResponse")
    public List<Espectaculolocalidadescenario> espectaculoCompleto();

    /**
     * 
     * @return
     *     returns java.util.List<com.reaper.servicio.Formapago>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listFormaPago", targetNamespace = "http://servicio.reaper.com/", className = "com.reaper.servicio.ListFormaPago")
    @ResponseWrapper(localName = "listFormaPagoResponse", targetNamespace = "http://servicio.reaper.com/", className = "com.reaper.servicio.ListFormaPagoResponse")
    @Action(input = "http://servicio.reaper.com/WS_MiBoleto/listFormaPagoRequest", output = "http://servicio.reaper.com/WS_MiBoleto/listFormaPagoResponse")
    public List<Formapago> listFormaPago();

    /**
     * 
     * @param escId
     * @param espId
     * @return
     *     returns java.util.List<com.reaper.servicio.Espectaculolocalidadescenario>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "localidadCompleto", targetNamespace = "http://servicio.reaper.com/", className = "com.reaper.servicio.LocalidadCompleto")
    @ResponseWrapper(localName = "localidadCompletoResponse", targetNamespace = "http://servicio.reaper.com/", className = "com.reaper.servicio.LocalidadCompletoResponse")
    @Action(input = "http://servicio.reaper.com/WS_MiBoleto/localidadCompletoRequest", output = "http://servicio.reaper.com/WS_MiBoleto/localidadCompletoResponse")
    public List<Espectaculolocalidadescenario> localidadCompleto(
        @WebParam(name = "espId", targetNamespace = "")
        int espId,
        @WebParam(name = "escId", targetNamespace = "")
        int escId);

}