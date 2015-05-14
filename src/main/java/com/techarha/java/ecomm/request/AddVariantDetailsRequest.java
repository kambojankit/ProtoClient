
package com.techarha.java.ecomm.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.techarha.java.ecomm.model.UID;
import com.techarha.java.ecomm.model.Variant;


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
 *         &lt;element ref="{http://www.techarha.com/schema/xsd/ecomm/Product}Variant"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "uid",
    "variant",
    "userID"
})
@XmlRootElement(name = "addVariantDetailsRequest")
public class AddVariantDetailsRequest {

    @XmlElement(name = "UID", namespace = "http://www.techarha.com/schema/xsd/ecomm/Product", required = true)
    protected UID uid;
    @XmlElement(name = "Variant", namespace = "http://www.techarha.com/schema/xsd/ecomm/Product", required = true)
    protected Variant variant;
    @XmlElement(required = true)
    protected String userID;

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

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setVariant(Variant value) {
        this.variant = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

}
