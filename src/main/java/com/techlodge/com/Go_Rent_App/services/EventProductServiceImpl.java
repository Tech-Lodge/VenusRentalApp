package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.dtos.request.DeleteProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.EventProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.UpdateProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.ViewAllProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.DeleteProductResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.EventProductResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.UpdateProductResponse;
import com.semicolon.africa.Go_Rent_App.exception.ProductNotFoundException;
import com.semicolon.africa.Go_Rent_App.models.EventProduct;
import com.semicolon.africa.Go_Rent_App.repository.EventProductRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventProductServiceImpl implements EventProductServiceInterface{

    private final ModelMapper modelMapper;
    private final EventProductRepo eventProductRepo;

    public EventProductResponse createEventProduct(EventProductRequest request){
        EventProduct mappedProduct = modelMapper.map(request, EventProduct.class);
        eventProductRepo.save(mappedProduct);
        EventProductResponse response = new EventProductResponse();
        response.setMessage("Created Product Successfully");
        return response;
        }

    public UpdateProductResponse updateEventProduct(UpdateProductRequest request){
        EventProduct foundEventProduct = eventProductRepo.findEventProductById(request.getId());
        if(foundEventProduct == null){
            throw new ProductNotFoundException("Product not found\nPls try again");
        }
        foundEventProduct.setProductName(request.getProductName());
        foundEventProduct.setPrice(request.getPrice());
        foundEventProduct.setProductCategory(request.getProductCategory());
        foundEventProduct.setDescription(request.getDescription());
        eventProductRepo.save(foundEventProduct);
        UpdateProductResponse response = new UpdateProductResponse();
        response.setMessage("Updated Product Successfully");
        return response;
    }

    public DeleteProductResponse deleteProduct(DeleteProductRequest request){
        EventProduct product = eventProductRepo.findEventProductById(request.getId());
        if(product == null){
            throw new ProductNotFoundException("Product not found\nPls try again");
        }
        eventProductRepo.delete(product);
        DeleteProductResponse response = new DeleteProductResponse();
        response.setMessage("Deleted product Successfully");
        return response;
    }

    public List<EventProduct> viewAllProduct(){
//        return eventProductRepo.findAllByUser_Id();
        return null;
    }
}
