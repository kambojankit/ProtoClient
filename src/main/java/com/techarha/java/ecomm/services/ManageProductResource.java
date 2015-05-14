/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.techarha.java.ecomm.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.techarha.java.ecomm.request.AddProductDetailsRequest;

@Path("/ManageProduct")
public interface ManageProductResource {

    @POST
    @Consumes("application/xml")
    @Produces("application/json")
    @Path("/addProductDetails")
    Response postAddProductDetails(AddProductDetailsRequest addproductdetailsrequest);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/addVariantDetails")
    Response postAddVariantDetails();

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/getProductDetails")
    Response getGetProductDetails();

    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/getVariantDetails")
    Response getGetVariantDetails();

    @GET
    @Produces("application/json")
    @Path("/ping")
    Response getPing();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/updateProductDetails")
    Response postUpdateProductDetails();

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/updateVariantDetails")
    Response postUpdateVariantDetails();

}