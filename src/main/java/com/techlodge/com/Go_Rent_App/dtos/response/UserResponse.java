package com.semicolon.africa.Go_Rent_App.dtos.response;

import com.semicolon.africa.Go_Rent_App.models.User;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class UserResponse {

    private Boolean isAvailable;
    private String address;
    private BigDecimal price;
    private User user;
}
