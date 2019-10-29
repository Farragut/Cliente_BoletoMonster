
package com.reaper.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formapago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formapago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fpDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fpId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formapago", propOrder = {
    "fpDescripcion",
    "fpId"
})
public class Formapago {

    protected String fpDescripcion;
    protected Integer fpId;

    /**
     * Obtiene el valor de la propiedad fpDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpDescripcion() {
        return fpDescripcion;
    }

    /**
     * Define el valor de la propiedad fpDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpDescripcion(String value) {
        this.fpDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fpId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFpId() {
        return fpId;
    }

    /**
     * Define el valor de la propiedad fpId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFpId(Integer value) {
        this.fpId = value;
    }

}
