package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.constants.Availability;
import com.semicolon.africa.Go_Rent_App.dtos.request.CreateTransactionRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootTest
public class TransactionServiceTest {

    @Test
    public void testThatUserCanCreateTransaction() {
        CreateTransactionRequest request = createTransaction();

    }

    private CreateTransactionRequest createTransaction() {
        CreateTransactionRequest request = new CreateTransactionRequest();
        request.setEventProductId(1L);
        request.setStartDate(LocalDateTime.now());
        request.setEndDate(LocalDateTime.parse("20/11/24"));
        request.setStatus(true);
        request.setAvailability(Availability.AVAILABLE);
        request.setProductName("Camera");
        request.setTotalAmount(BigDecimal.valueOf(100000));
        return request;
    }

}