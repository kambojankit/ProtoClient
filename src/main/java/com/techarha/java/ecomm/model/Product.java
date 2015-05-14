
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
 *         &lt;element ref="{http://www.techarha.com/schema/xsd/ecomm/Product}ProductInfoType"/>
 *         &lt;element ref="{http://www.techarha.com/schema/xsd/ecomm/Product}ProductDetailsType"/>
 *         &lt;element ref="{http://www.techarha.com/schema/xsd/ecomm/Product}ProductCategoryType"/>
 *         &lt;element ref="{http://www.techarha.com/schema/xsd/ecomm/Product}ProductInventoryType"/>
 *         &lt;element ref="{http://www.techarha.com/schema/xsd/ecomm/Product}VendorDetailsType"/>
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
    "productInfoType",
    "productDetailsType",
    "productCategoryType",
    "productInventoryType",
    "vendorDetailsType"
})
@XmlRootElement(name = "Product")
public class Product {

    @XmlElement(name = "ProductInfoType", required = true)
    protected ProductInfoType productInfoType;
    @XmlElement(name = "ProductDetailsType", required = true)
    protected ProductDetailsType productDetailsType;
    @XmlElement(name = "ProductCategoryType", required = true)
    protected ProductCategoryType productCategoryType;
    @XmlElement(name = "ProductInventoryType", required = true)
    protected ProductInventoryType productInventoryType;
    @XmlElement(name = "VendorDetailsType", required = true)
    protected VendorDetailsType vendorDetailsType;

    /**
     * Gets the value of the productInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInfoType }
     *     
     */
    public ProductInfoType getProductInfoType() {
        return productInfoType;
    }

    /**
     * Sets the value of the productInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInfoType }
     *     
     */
    public void setProductInfoType(ProductInfoType value) {
        this.productInfoType = value;
    }

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
     * Gets the value of the productCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryType }
     *     
     */
    public ProductCategoryType getProductCategoryType() {
        return productCategoryType;
    }

    /**
     * Sets the value of the productCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryType }
     *     
     */
    public void setProductCategoryType(ProductCategoryType value) {
        this.productCategoryType = value;
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

    /**
     * Gets the value of the vendorDetailsType property.
     * 
     * @return
     *     possible object is
     *     {@link VendorDetailsType }
     *     
     */
    public VendorDetailsType getVendorDetailsType() {
        return vendorDetailsType;
    }

    /**
     * Sets the value of the vendorDetailsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorDetailsType }
     *     
     */
    public void setVendorDetailsType(VendorDetailsType value) {
        this.vendorDetailsType = value;
    }

}
