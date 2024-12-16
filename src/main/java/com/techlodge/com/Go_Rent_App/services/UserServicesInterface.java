package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.dtos.request.CreateUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.LoginUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.UpdateUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.CreateUserResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.LoginUserResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.UpdateUserResponse;

public interface UserServicesInterface {

    CreateUserResponse createUser(CreateUserRequest request);
    UpdateUserResponse updateUser(UpdateUserRequest request);
    LoginUserResponse loginUser(LoginUserRequest request);

}
