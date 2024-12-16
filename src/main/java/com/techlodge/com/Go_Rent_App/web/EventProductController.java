package com.semicolon.africa.Go_Rent_App.web;

import com.semicolon.africa.Go_Rent_App.dtos.request.*;
import com.semicolon.africa.Go_Rent_App.dtos.response.DeleteProductResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.EventProductResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.UpdateProductResponse;
import com.semicolon.africa.Go_Rent_App.services.EventProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/eventproduct")
@AllArgsConstructor
public class EventProductController {

    private final EventProductServiceImpl service;

    @PostMapping(value = "create_product")
    public ResponseEntity<?> createProduct(@RequestBody EventProductRequest request){
        try{
            EventProductResponse response = service.createEventProduct(request);
            return new ResponseEntity<>(new ApiResponse(true, response), OK);
        }catch(Exception exception){
            return new ResponseEntity<>( new ApiResponse(false, exception.getMessage()), BAD_GATEWAY);
        }
    }

    @PatchMapping(value = "update-product")
    public ResponseEntity<?> updateProduct(@RequestBody UpdateProductRequest request){
        try{
            UpdateProductResponse response = service.updateEventProduct(request);
            return new ResponseEntity<>(new ApiResponse(true, response), OK);
        }catch(Exception exception){
            return new ResponseEntity<>(new ApiResponse(false, exception.getMessage()), BAD_REQUEST);
        }
    }

    @DeleteMapping(value = "delete-product")
    public ResponseEntity<?> deleteMapping(@RequestBody DeleteProductRequest request){
        try{
            DeleteProductResponse response = service.deleteProduct(request);
            return new ResponseEntity<>(new ApiResponse(true, response), OK);
        }catch(Exception exception){
            return new ResponseEntity<>(new ApiResponse(false, exception.getMessage()), BAD_REQUEST);
        }
    }




}
