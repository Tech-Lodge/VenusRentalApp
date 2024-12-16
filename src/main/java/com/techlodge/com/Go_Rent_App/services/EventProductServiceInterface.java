package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.dtos.request.DeleteProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.EventProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.UpdateProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.DeleteProductResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.EventProductResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.UpdateProductResponse;

public interface EventProductServiceInterface {

    EventProductResponse createEventProduct(EventProductRequest request);
    UpdateProductResponse updateEventProduct(UpdateProductRequest request);
    DeleteProductResponse deleteProduct(DeleteProductRequest request);


}
