package com.semicolon.africa.Go_Rent_App.web;

import com.semicolon.africa.Go_Rent_App.dtos.request.ApiResponse;
import com.semicolon.africa.Go_Rent_App.dtos.request.CreateUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.LoginUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.UpdateUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.CreateUserResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.LoginUserResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.UpdateUserResponse;
import com.semicolon.africa.Go_Rent_App.services.UserServicesImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RestController
@AllArgsConstructor

public class UserController {

    private final UserServicesImpl services;

    @PostMapping("/register_user")
    public ResponseEntity<?> registerUser(@RequestBody CreateUserRequest request) {
        try {
            CreateUserResponse response = services.createUser(request);
            return new ResponseEntity<>(new ApiResponse(true, response), OK);
        } catch (Exception exception) {
            return new ResponseEntity<>(new ApiResponse(false, exception.getMessage()), BAD_REQUEST);
        }
    }

    @PatchMapping("/login_user")
    public ResponseEntity<?> loginUser(@RequestBody LoginUserRequest request){
        try{
            LoginUserResponse response = services.loginUser(request);
            return new ResponseEntity<>(new ApiResponse(true, response), OK);
        }catch(Exception exception){
            return new ResponseEntity<>(new ApiResponse(false, exception.getMessage()), BAD_GATEWAY);
        }
    }

    @PatchMapping("/edit-user")
    public ResponseEntity<?> updateUser(@RequestBody UpdateUserRequest request) {
        try {
            UpdateUserResponse response = services.updateUser(request);
            return new ResponseEntity<>(new ApiResponse(true, response), OK);
        } catch (Exception exception) {
            return new ResponseEntity<>(new ApiResponse(false, exception.getMessage()), BAD_REQUEST);
        }
    }
}
