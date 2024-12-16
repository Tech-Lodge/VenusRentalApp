package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.constants.Category;
import com.semicolon.africa.Go_Rent_App.dtos.request.DeleteProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.EventProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.UpdateProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.ViewAllProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.DeleteProductResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.EventProductResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.UpdateProductResponse;
import com.semicolon.africa.Go_Rent_App.models.EventProduct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class RenterTransactionServicesTest {

    @Autowired
    private EventProductServiceImpl eventProductService;

    @Test
    public void testThatUserCanAddProduct(){
        EventProductRequest request = buildRequest();
        EventProductResponse response = eventProductService.createEventProduct(request);
        assertNotNull(response);
   }

   @Test
   public void testTHatUserCanUpdateProduct(){
       UpdateProductRequest request = updateProductRequest();
       UpdateProductResponse product = eventProductService.updateEventProduct(request);
        assertNotNull(product);
   }

   @Test
   public void testThatUserCanDeleteProduct(){
       DeleteProductRequest request = new DeleteProductRequest();
       request.setId(1L);
       DeleteProductResponse response = eventProductService.deleteProduct(request);
       assertNotNull(response);
   }

   @Test
   public void testToViewAllUserProduct(){
        List<EventProduct> request = eventProductService.viewAllProduct();
        assertNotNull(request);
   }

   private EventProductRequest buildRequest(){
        EventProductRequest product = new EventProductRequest();
        product.setUserId(1L);
        product.setProductName("Photographic Camera");
        product.setProductCategory(Category.MEDIA);
        product.setPrice(BigDecimal.valueOf(10000));
        product.setDescription("New Camera for sale");
        return product;
    }

    private UpdateProductRequest updateProductRequest(){
        UpdateProductRequest product = new UpdateProductRequest();
        product.setId(1L);
        product.setProductCategory(Category.MEDIA);
        product.setProductName("Nikon Camera");
        product.setPrice(BigDecimal.valueOf(10));
        product.setDescription("New and improved Camera");
        return product;
    }

}
