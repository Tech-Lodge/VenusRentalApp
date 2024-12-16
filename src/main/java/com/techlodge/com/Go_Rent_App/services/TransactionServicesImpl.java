package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.dtos.request.CreateTransactionRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.CreateTransactionResponse;
import com.semicolon.africa.Go_Rent_App.models.Transaction;
import com.semicolon.africa.Go_Rent_App.repository.TransactionRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionServicesImpl implements TransactionServicesInterface{

    private final ModelMapper modelMapper;
    private final TransactionRepo transactionRepo;

    public CreateTransactionResponse createTransaction(CreateTransactionRequest request){
        Transaction createdTransaction = modelMapper.map(request, Transaction.class);
        transactionRepo.save(createdTransaction);
        CreateTransactionResponse response = new CreateTransactionResponse();
        response.setMessage("Created Transaction successfully");
        return response;
    }

}
