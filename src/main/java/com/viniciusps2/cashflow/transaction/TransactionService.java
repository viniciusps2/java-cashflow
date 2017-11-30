package com.viniciusps2.cashflow.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public Page<Transaction> findAll (Pageable pageRequest) {
        return transactionRepository.findAll(pageRequest);
    }
}
