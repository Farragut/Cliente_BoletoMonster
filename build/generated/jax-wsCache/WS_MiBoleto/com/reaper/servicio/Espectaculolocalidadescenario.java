
package com.reaper.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para espectaculolocalidadescenario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="espectaculolocalidadescenario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="escenario" type="{http://servicio.reaper.com/}escenario" minOccurs="0"/&gt;
 *         &lt;element name="espectaculolocalidadescenarioPK" type="{http://servicio.reaper.com/}espectaculolocalidadescenarioPK" minOccurs="0"/&gt;
 *         &lt;element name="espectaculoprograma" type="{http://servicio.reaper.com/}espectaculoprograma" minOccurs="0"/&gt;
 *         &lt;element name="locEscCapacidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="locEscPrecio" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="localidad" type="{http://servicio.reaper.com/}localidad" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "espectaculolocalidadescenario", propOrder = {
    "escenario",
    "espectaculolocalidadescenarioPK",
    "espectaculoprograma",
    "locEscCapacidad",
    "locEscPrecio",
    "localidad"
})
public class Espectaculolocalidadescenario {

    protected Escenario escenario;
    protected EspectaculolocalidadescenarioPK espectaculolocalidadescenarioPK;
    protected Espectaculoprograma espectaculoprograma;
    protected int locEscCapacidad;
    protected float locEscPrecio;
    protected Localidad localidad;

    /**
     * Obtiene el valor de la propiedad escenario.
     * 
     * @return
     *     possible object is
     *     {@link Escenario }
     *     
     */
    public Escenario getEscenario() {
        return escenario;
    }

    /**
     * Define el valor de la propiedad escenario.
     * 
     * @param value
     *     allowed object is
     *     {@link Escenario }
     *     
     */
    public void setEscenario(Escenario value) {
        this.escenario = value;
    }

    /**
     * Obtiene el valor de la propiedad espectaculolocalidadescenarioPK.
     * 
     * @return
     *     possible object is
     *     {@link EspectaculolocalidadescenarioPK }
     *     
     */
    public EspectaculolocalidadescenarioPK getEspectaculolocalidadescenarioPK() {
        return espectaculolocalidadescenarioPK;
    }

    /**
     * Define el valor de la propiedad espectaculolocalidadescenarioPK.
     * 
     * @param value
     *     allowed object is
     *     {@link EspectaculolocalidadescenarioPK }
     *     
     */
    public void setEspectaculolocalidadescenarioPK(EspectaculolocalidadescenarioPK value) {
        this.espectaculolocalidadescenarioPK = value;
    }

    /**
     * Obtiene el valor de la propiedad espectaculoprograma.
     * 
     * @return
     *     possible object is
     *     {@link Espectaculoprograma }
     *     
     */
    public Espectaculoprograma getEspectaculoprograma() {
        return espectaculoprograma;
    }

    /**
     * Define el valor de la propiedad espectaculoprograma.
     * 
     * @param value
     *     allowed object is
     *     {@link Espectaculoprograma }
     *     
     */
    public void setEspectaculoprograma(Espectaculoprograma value) {
        this.espectaculoprograma = value;
    }

    /**
     * Obtiene el valor de la propiedad locEscCapacidad.
     * 
     */
    public int getLocEscCapacidad() {
        return locEscCapacidad;
    }

    /**
     * Define el valor de la propiedad locEscCapacidad.
     * 
     */
    public void setLocEscCapacidad(int value) {
        this.locEscCapacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad locEscPrecio.
     * 
     */
    public float getLocEscPrecio() {
        return locEscPrecio;
    }

    /**
     * Define el valor de la propiedad locEscPrecio.
     * 
     */
    public void setLocEscPrecio(float value) {
        this.locEscPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link Localidad }
     *     
     */
    public Localidad getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Localidad }
     *     
     */
    public void setLocalidad(Localidad value) {
        this.localidad = value;
    }

}
