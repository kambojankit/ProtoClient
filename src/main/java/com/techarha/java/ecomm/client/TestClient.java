package com.techarha.java.ecomm.client;

import com.techarha.java.ecomm.model.*;
import com.techarha.java.ecomm.model.common.CapacityType;
import com.techarha.java.ecomm.model.common.SizeType;
import com.techarha.java.ecomm.model.common.WeightType;
import com.techarha.java.ecomm.request.AddProductDetailsRequest;
import com.techarha.java.ecomm.response.PingResponse;
import org.apache.cxf.jaxrs.client.WebClient;

/**
 * Created by ankit on 15/04/15.
 */
public class TestClient {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("rest-client-context.xml");
//        ManageProductResource client = (ManageProductResource) context.getBean("testClient");
//
//        System.out.println(client.postAddProductDetails(prepareRequest()));

        WebClient client = WebClient.create( "http://localhost:8080/ProtoService/services/productManager" );

        PingResponse pingResponse = client.path("/ManageProduct/ping").accept( "application/json").get(PingResponse.class);
        System.out.println("Hello");
        System.out.println(pingResponse);

    }

    private static AddProductDetailsRequest prepareRequest(){
        AddProductDetailsRequest request = new AddProductDetailsRequest();
        request.setUserID("test");

        Product product = new Product();

        ProductDetailsType detailsType = new ProductDetailsType();
        detailsType.setBrand("testBrand");
        CapacityType capacityType = new CapacityType();
        capacityType.setValue(3);
        capacityType.setMetrics("c-cm");
        detailsType.setCapacity(capacityType);
        detailsType.setCharacters("TestCharacters");
        detailsType.setColor("testColor");
        detailsType.setGender("male");
        detailsType.setImageURI("test.com");
        detailsType.setMaterial("polyster");
        detailsType.setQuantityInStock("2");
        detailsType.setThumbnailURI("test.com");
        detailsType.setType("testType");
        SizeType sizeType = new SizeType();
        sizeType.setMetrics("in");
        sizeType.setLength(11);
        sizeType.setHeight(12);
        sizeType.setWidth(14);
        detailsType.setSize(sizeType);
        WeightType weightType = new WeightType();
        weightType.setMetrics("kg");
        weightType.setValue(1);
        detailsType.setWeight(weightType);
        product.setProductDetailsType(detailsType);


        ProductInfoType infoType = new ProductInfoType();
        infoType.setDescription("Test Description");
        infoType.setShortDescription("test desc");
        infoType.setProductName("Test Name");
        infoType.setProductTitle("Test Title");
        infoType.setRatings("5");
        product.setProductInfoType(infoType);

        ProductInventoryType inventoryType = new ProductInventoryType();
        inventoryType.setQuantity("3");
        product.setProductInventoryType(inventoryType);

        VendorDetailsType vendorDetailsType = new VendorDetailsType();
        vendorDetailsType.setVendorID("12345");
        vendorDetailsType.setVendorSPUC("12345");
        vendorDetailsType.setVendorSUK("234");

        product.setVendorDetailsType(vendorDetailsType);

        //Product Category
        ProductCategoryType categoryType = new ProductCategoryType();
        categoryType.setCategory("TestCat");
        categoryType.setDepartment("TestDepart");
        product.setProductCategoryType(categoryType);

        request.setProduct(product);
        return request;
    }


}
