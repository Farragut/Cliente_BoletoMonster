
package com.reaper.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para localidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="localidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="locNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localidad", propOrder = {
    "locId",
    "locNombre"
})
public class Localidad {

    protected Integer locId;
    protected String locNombre;

    /**
     * Obtiene el valor de la propiedad locId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocId() {
        return locId;
    }

    /**
     * Define el valor de la propiedad locId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocId(Integer value) {
        this.locId = value;
    }

    /**
     * Obtiene el valor de la propiedad locNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocNombre() {
        return locNombre;
    }

    /**
     * Define el valor de la propiedad locNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocNombre(String value) {
        this.locNombre = value;
    }

}
