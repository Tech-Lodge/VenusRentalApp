package com.semicolon.africa.Go_Rent_App.dtos.request;

import com.semicolon.africa.Go_Rent_App.constants.Category;
import com.semicolon.africa.Go_Rent_App.models.User;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class EventProductRequest {
    private Long userId;
    private Long id;
    private String productName;
    private String description;
    private BigDecimal price;
    private Category productCategory;
}
