
package com.reaper.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para espectaculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="espectaculo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="espId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="espNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="espTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "espectaculo", propOrder = {
    "espId",
    "espNombre",
    "espTipo"
})
public class Espectaculo {

    protected Integer espId;
    protected String espNombre;
    protected String espTipo;

    /**
     * Obtiene el valor de la propiedad espId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEspId() {
        return espId;
    }

    /**
     * Define el valor de la propiedad espId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEspId(Integer value) {
        this.espId = value;
    }

    /**
     * Obtiene el valor de la propiedad espNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspNombre() {
        return espNombre;
    }

    /**
     * Define el valor de la propiedad espNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspNombre(String value) {
        this.espNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad espTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspTipo() {
        return espTipo;
    }

    /**
     * Define el valor de la propiedad espTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspTipo(String value) {
        this.espTipo = value;
    }

}
