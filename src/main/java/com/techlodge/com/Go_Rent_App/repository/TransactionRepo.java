package com.semicolon.africa.Go_Rent_App.repository;

import com.semicolon.africa.Go_Rent_App.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {


}
