
package com.techarha.java.ecomm.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.techarha.java.ecomm.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.techarha.java.ecomm.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UID }
     * 
     */
    public UID createUID() {
        return new UID();
    }

    /**
     * Create an instance of {@link Variant }
     * 
     */
    public Variant createVariant() {
        return new Variant();
    }

    /**
     * Create an instance of {@link ProductDetailsType }
     * 
     */
    public ProductDetailsType createProductDetailsType() {
        return new ProductDetailsType();
    }

    /**
     * Create an instance of {@link ProductInventoryType }
     * 
     */
    public ProductInventoryType createProductInventoryType() {
        return new ProductInventoryType();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductInfoType }
     * 
     */
    public ProductInfoType createProductInfoType() {
        return new ProductInfoType();
    }

    /**
     * Create an instance of {@link ProductCategoryType }
     * 
     */
    public ProductCategoryType createProductCategoryType() {
        return new ProductCategoryType();
    }

    /**
     * Create an instance of {@link VendorDetailsType }
     * 
     */
    public VendorDetailsType createVendorDetailsType() {
        return new VendorDetailsType();
    }

}
