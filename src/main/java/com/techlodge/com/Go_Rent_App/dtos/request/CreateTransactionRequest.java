package com.semicolon.africa.Go_Rent_App.dtos.request;

import com.semicolon.africa.Go_Rent_App.constants.Availability;
import com.semicolon.africa.Go_Rent_App.models.EventProduct;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class CreateTransactionRequest {
    private Long eventProductId;
    private String productName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean status;
    private BigDecimal totalAmount;
    private Availability availability;
}
