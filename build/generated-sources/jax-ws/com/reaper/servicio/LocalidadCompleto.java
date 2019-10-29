
package com.reaper.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para localidadCompleto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="localidadCompleto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="espId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="escId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localidadCompleto", propOrder = {
    "espId",
    "escId"
})
public class LocalidadCompleto {

    protected int espId;
    protected int escId;

    /**
     * Obtiene el valor de la propiedad espId.
     * 
     */
    public int getEspId() {
        return espId;
    }

    /**
     * Define el valor de la propiedad espId.
     * 
     */
    public void setEspId(int value) {
        this.espId = value;
    }

    /**
     * Obtiene el valor de la propiedad escId.
     * 
     */
    public int getEscId() {
        return escId;
    }

    /**
     * Define el valor de la propiedad escId.
     * 
     */
    public void setEscId(int value) {
        this.escId = value;
    }

}
