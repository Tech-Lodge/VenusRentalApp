package com.semicolon.africa.Go_Rent_App.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUserRequest {

    private Long id;
    private String email;
    private String password;
}
