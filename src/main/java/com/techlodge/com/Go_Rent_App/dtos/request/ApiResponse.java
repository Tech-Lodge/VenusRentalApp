package com.semicolon.africa.Go_Rent_App.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ApiResponse {

    private boolean isSuccessful;
    private Object data;

}
