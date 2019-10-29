
package com.reaper.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para espectaculoprograma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="espectaculoprograma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="espEscDisponibilidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="espEscFecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="espEscHora" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="espEscId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="espEscPrecio" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="espId" type="{http://servicio.reaper.com/}espectaculo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "espectaculoprograma", propOrder = {
    "espEscDisponibilidad",
    "espEscFecha",
    "espEscHora",
    "espEscId",
    "espEscPrecio",
    "espId"
})
public class Espectaculoprograma {

    protected int espEscDisponibilidad;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar espEscFecha;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar espEscHora;
    protected Integer espEscId;
    protected float espEscPrecio;
    protected Espectaculo espId;

    /**
     * Obtiene el valor de la propiedad espEscDisponibilidad.
     * 
     */
    public int getEspEscDisponibilidad() {
        return espEscDisponibilidad;
    }

    /**
     * Define el valor de la propiedad espEscDisponibilidad.
     * 
     */
    public void setEspEscDisponibilidad(int value) {
        this.espEscDisponibilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad espEscFecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEspEscFecha() {
        return espEscFecha;
    }

    /**
     * Define el valor de la propiedad espEscFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEspEscFecha(XMLGregorianCalendar value) {
        this.espEscFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad espEscHora.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEspEscHora() {
        return espEscHora;
    }

    /**
     * Define el valor de la propiedad espEscHora.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEspEscHora(XMLGregorianCalendar value) {
        this.espEscHora = value;
    }

    /**
     * Obtiene el valor de la propiedad espEscId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEspEscId() {
        return espEscId;
    }

    /**
     * Define el valor de la propiedad espEscId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEspEscId(Integer value) {
        this.espEscId = value;
    }

    /**
     * Obtiene el valor de la propiedad espEscPrecio.
     * 
     */
    public float getEspEscPrecio() {
        return espEscPrecio;
    }

    /**
     * Define el valor de la propiedad espEscPrecio.
     * 
     */
    public void setEspEscPrecio(float value) {
        this.espEscPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad espId.
     * 
     * @return
     *     possible object is
     *     {@link Espectaculo }
     *     
     */
    public Espectaculo getEspId() {
        return espId;
    }

    /**
     * Define el valor de la propiedad espId.
     * 
     * @param value
     *     allowed object is
     *     {@link Espectaculo }
     *     
     */
    public void setEspId(Espectaculo value) {
        this.espId = value;
    }

}
