package com.semicolon.africa.Go_Rent_App.models;

import com.semicolon.africa.Go_Rent_App.constants.Availability;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Transaction {

    @ManyToOne
    private User userId;
    @ManyToOne
    private EventProduct eventProductId;
    private String productName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean status;
    private BigDecimal totalAmount;
    private Availability availability;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
