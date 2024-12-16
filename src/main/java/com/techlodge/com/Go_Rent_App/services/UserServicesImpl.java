package com.semicolon.africa.Go_Rent_App.services;


import com.semicolon.africa.Go_Rent_App.dtos.request.*;
import com.semicolon.africa.Go_Rent_App.dtos.response.CreateUserResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.LoginUserResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.LogoutUserResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.UpdateUserResponse;
import com.semicolon.africa.Go_Rent_App.exception.IsAlreadyLoggedInException;
import com.semicolon.africa.Go_Rent_App.exception.ProductNotFoundException;
import com.semicolon.africa.Go_Rent_App.exception.UserNotFoundException;
import com.semicolon.africa.Go_Rent_App.models.User;
import com.semicolon.africa.Go_Rent_App.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServicesImpl implements UserServicesInterface{

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    public CreateUserResponse createUser(CreateUserRequest request){
        CreateUserResponse response = new CreateUserResponse();
        User newUser = modelMapper.map(request, User.class);
        userRepository.save(newUser);
        response.setMessage("Registered User Successfully");
        return response;
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request){
        User foundUser = userRepository.findUserByEmail(request.getEmail());
        if(foundUser == null){
            throw new UserNotFoundException("Product not found\nPls try again");
        }
        User mappedUser = modelMapper.map(foundUser, User.class);
        userRepository.save(mappedUser);
        UpdateUserResponse response = new UpdateUserResponse();
        response.setMessage("User Updated Successfully");
        return response;
    }

    public LoginUserResponse loginUser(LoginUserRequest request){
        User user = userRepository.findUserById(request.getId());
        if(user == null){
            throw new UserNotFoundException("User cannot be found\nPlease try again later");
        }
        if(user.getIsLoggedIn().equals("false")){
            user.setIsLoggedIn("true");
            userRepository.save(user);
        }
        else{
            throw new IsAlreadyLoggedInException("User is already logged in !!!");
        }
        LoginUserResponse response = new LoginUserResponse();
        response.setMessage("User Successfully logged in");
        return response;
    }


    public LogoutUserResponse logoutUser(LogoutUserRequest request){
        User user = userRepository.findUserById(request.getId());
        if(user == null){
            throw new UserNotFoundException("User cannot be found\nPlease try again later");
        }
        if(user.getIsLoggedIn().equals("true")){
            user.setIsLoggedIn("false");
            userRepository.save(user);
        }
        else{
            throw new IsAlreadyLoggedInException("Please login !!!");
        }
        LogoutUserResponse response = new LogoutUserResponse();
        response.setMessage("User Successfully logged out");
        return response;
    }


}
