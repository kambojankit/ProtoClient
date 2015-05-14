
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
 *         &lt;element ref="{http://www.techarha.com/schema/xsd/ecomm/Product}ProductDetailsType"/>
 *         &lt;element ref="{http://www.techarha.com/schema/xsd/ecomm/Product}ProductInventoryType"/>
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
    "productDetailsType",
    "productInventoryType"
})
@XmlRootElement(name = "Variant")
public class Variant {

    @XmlElement(name = "ProductDetailsType", required = true)
    protected ProductDetailsType productDetailsType;
    @XmlElement(name = "ProductInventoryType", required = true)
    protected ProductInventoryType productInventoryType;

    /**
     * Gets the value of the productDetailsType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsType }
     *     
     */
    public ProductDetailsType getProductDetailsType() {
        return productDetailsType;
    }

    /**
     * Sets the value of the productDetailsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsType }
     *     
     */
    public void setProductDetailsType(ProductDetailsType value) {
        this.productDetailsType = value;
    }

    /**
     * Gets the value of the productInventoryType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInventoryType }
     *     
     */
    public ProductInventoryType getProductInventoryType() {
        return productInventoryType;
    }

    /**
     * Sets the value of the productInventoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInventoryType }
     *     
     */
    public void setProductInventoryType(ProductInventoryType value) {
        this.productInventoryType = value;
    }

}
