package com.viniciusps2.cashflow;

import com.viniciusps2.cashflow.account.Account;
import com.viniciusps2.cashflow.account.AccountRepository;
import com.viniciusps2.cashflow.transaction.Transaction;
import com.viniciusps2.cashflow.transaction.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@Component
public class Seed {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @PostConstruct
    public void init() {
/*

        Account account = new Account("Santander");
        accountRepository.save(account);
        for (int i = 0; i < 20; i++) {
            BigDecimal value = new BigDecimal(100.50 + i)
                    .divide(new BigDecimal(2), RoundingMode.DOWN);

            transactionRepository.save(
                    new Transaction(String.format("Compra %d", i), value, account, new Date())
            );
        }
*/


    }
}
