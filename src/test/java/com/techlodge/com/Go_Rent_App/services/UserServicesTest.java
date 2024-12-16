package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.dtos.request.CreateUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.LoginUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.LogoutUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.UpdateUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.CreateUserResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.LoginUserResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.LogoutUserResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.UpdateUserResponse;
import com.semicolon.africa.Go_Rent_App.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class UserServicesTest {

    @Autowired
    private UserServicesImpl userServices;

    @Test
    public void testThatUserCanRegister(){
        CreateUserRequest user = buildUser();
        CreateUserResponse createdUser = userServices.createUser(user);
        assertNotNull(createdUser);
//        assertThrows
    }

    @Test
    public void testThatUpdateUser(){
        UpdateUserRequest request = updateUser();
        UpdateUserResponse response = userServices.updateUser(request);
        assertNotNull(response);
    }

    @Test
    public void testThatUserCanLogin(){
        LoginUserRequest request = new LoginUserRequest();
        request.setId(1L);
        LoginUserResponse response = userServices.loginUser(request);
        assertNotNull(response);
    }

    @Test
    public void testThatUserCanLogout(){
        LogoutUserRequest request = new LogoutUserRequest();
        LogoutUserResponse response = userServices.logoutUser(request);
    }

    private CreateUserRequest buildUser(){
        CreateUserRequest user = new CreateUserRequest();
        user.setEmail("kim1@gmail.com");
        user.setFirstName("Kim");
        user.setLastName("Davids");
        user.setPhoneNumber("09055429111");
        user.setAddress("Yaba Lagos, Nigeria");
        user.setIsLoggedIn("true");
        return user;
    }

    private UpdateUserRequest updateUser(){
        UpdateUserRequest user = new UpdateUserRequest();
        user.setEmail("kim@gmail.com");
        user.setFirstName("Karen");
        user.setLastName("Davids");
        user.setPhoneNumber("09067908765");
        return user;
    }

}
