
package com.reaper.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para escenario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="escenario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="escCapacidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="escId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="escNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "escenario", propOrder = {
    "escCapacidad",
    "escId",
    "escNombre"
})
public class Escenario {

    protected int escCapacidad;
    protected Integer escId;
    protected String escNombre;

    /**
     * Obtiene el valor de la propiedad escCapacidad.
     * 
     */
    public int getEscCapacidad() {
        return escCapacidad;
    }

    /**
     * Define el valor de la propiedad escCapacidad.
     * 
     */
    public void setEscCapacidad(int value) {
        this.escCapacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad escId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEscId() {
        return escId;
    }

    /**
     * Define el valor de la propiedad escId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEscId(Integer value) {
        this.escId = value;
    }

    /**
     * Obtiene el valor de la propiedad escNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscNombre() {
        return escNombre;
    }

    /**
     * Define el valor de la propiedad escNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscNombre(String value) {
        this.escNombre = value;
    }

}
