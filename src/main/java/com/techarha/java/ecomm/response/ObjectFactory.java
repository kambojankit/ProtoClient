
package com.techarha.java.ecomm.response;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.techarha.java.ecomm.response package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.techarha.java.ecomm.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StockResponse }
     * 
     */
    public StockResponse createStockResponse() {
        return new StockResponse();
    }

    /**
     * Create an instance of {@link GetVariantDetailsResponse }
     * 
     */
    public GetVariantDetailsResponse createGetVariantDetailsResponse() {
        return new GetVariantDetailsResponse();
    }

    /**
     * Create an instance of {@link AddProductDetailsResponse }
     * 
     */
    public AddProductDetailsResponse createAddProductDetailsResponse() {
        return new AddProductDetailsResponse();
    }

    /**
     * Create an instance of {@link AddVariantDetailsResponse }
     * 
     */
    public AddVariantDetailsResponse createAddVariantDetailsResponse() {
        return new AddVariantDetailsResponse();
    }

    /**
     * Create an instance of {@link UpdateVariantDetailsResponse }
     * 
     */
    public UpdateVariantDetailsResponse createUpdateVariantDetailsResponse() {
        return new UpdateVariantDetailsResponse();
    }

    /**
     * Create an instance of {@link GetProductDetailsResponse }
     * 
     */
    public GetProductDetailsResponse createGetProductDetailsResponse() {
        return new GetProductDetailsResponse();
    }

    /**
     * Create an instance of {@link UpdateProductDetailsResponse }
     * 
     */
    public UpdateProductDetailsResponse createUpdateProductDetailsResponse() {
        return new UpdateProductDetailsResponse();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

}
