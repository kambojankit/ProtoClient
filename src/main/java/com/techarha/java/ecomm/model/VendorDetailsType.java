
package com.techarha.java.ecomm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="vendorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendorSUK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendorSPUC" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "vendorID",
    "vendorSUK",
    "vendorSPUC"
})
@XmlRootElement(name = "VendorDetailsType")
public class VendorDetailsType {

    @XmlElement(required = true)
    protected String vendorID;
    @XmlElement(required = true)
    protected String vendorSUK;
    @XmlElement(required = true)
    protected String vendorSPUC;

    /**
     * Gets the value of the vendorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorID() {
        return vendorID;
    }

    /**
     * Sets the value of the vendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorID(String value) {
        this.vendorID = value;
    }

    /**
     * Gets the value of the vendorSUK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorSUK() {
        return vendorSUK;
    }

    /**
     * Sets the value of the vendorSUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorSUK(String value) {
        this.vendorSUK = value;
    }

    /**
     * Gets the value of the vendorSPUC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorSPUC() {
        return vendorSPUC;
    }

    /**
     * Sets the value of the vendorSPUC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorSPUC(String value) {
        this.vendorSPUC = value;
    }

}
