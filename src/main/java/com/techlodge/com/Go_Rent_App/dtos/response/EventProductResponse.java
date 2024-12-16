package com.semicolon.africa.Go_Rent_App.dtos.response;

import com.semicolon.africa.Go_Rent_App.models.User;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class EventProductResponse {

    private Boolean isAvailable;
    private String address;
    private BigDecimal price;
    private User user;
    private Boolean userConsent;
    private String message;


}
