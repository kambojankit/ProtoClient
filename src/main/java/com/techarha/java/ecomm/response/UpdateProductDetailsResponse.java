
package com.techarha.java.ecomm.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.techarha.java.ecomm.model.UID;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.techarha.com/schema/xsd/ecomm/Product}UID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uid"
})
@XmlRootElement(name = "updateProductDetailsResponse")
public class UpdateProductDetailsResponse {

    @XmlElement(name = "UID", namespace = "http://www.techarha.com/schema/xsd/ecomm/Product", required = true)
    protected UID uid;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link UID }
     *     
     */
    public UID getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UID }
     *     
     */
    public void setUID(UID value) {
        this.uid = value;
    }

}
