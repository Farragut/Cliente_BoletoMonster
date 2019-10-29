
package com.reaper.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para espectaculolocalidadescenarioPK complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="espectaculolocalidadescenarioPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="escId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="espEscId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="locId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "espectaculolocalidadescenarioPK", propOrder = {
    "escId",
    "espEscId",
    "locId"
})
public class EspectaculolocalidadescenarioPK {

    protected int escId;
    protected int espEscId;
    protected int locId;

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

    /**
     * Obtiene el valor de la propiedad espEscId.
     * 
     */
    public int getEspEscId() {
        return espEscId;
    }

    /**
     * Define el valor de la propiedad espEscId.
     * 
     */
    public void setEspEscId(int value) {
        this.espEscId = value;
    }

    /**
     * Obtiene el valor de la propiedad locId.
     * 
     */
    public int getLocId() {
        return locId;
    }

    /**
     * Define el valor de la propiedad locId.
     * 
     */
    public void setLocId(int value) {
        this.locId = value;
    }

}
