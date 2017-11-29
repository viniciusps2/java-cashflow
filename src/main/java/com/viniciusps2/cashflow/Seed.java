package com.viniciusps2.cashflow;

import com.viniciusps2.cashflow.account.Account;
import com.viniciusps2.cashflow.account.AccountRepository;
import com.viniciusps2.cashflow.transaction.Transaction;
import com.viniciusps2.cashflow.transaction.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Seed {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @PostConstruct
    public void init() {

        Account account = new Account("Santander");
        accountRepository.save(account);
        transactionRepository.save(new Transaction("Compra 1", 55.0, account));
        transactionRepository.save(new Transaction("Compra 2", 115.0, account));

    }
}
