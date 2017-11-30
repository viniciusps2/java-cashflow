package com.viniciusps2.cashflow.transaction;

import com.viniciusps2.cashflow.account.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
public class TransactionServiceTest {
    @Autowired
    private TransactionService transactionService;

    @MockBean
    private TransactionRepository transactionRepository;

    @Before
    public void setUp(){
        Account account = new Account("Bank 1");
        List<Transaction> transactions = new LinkedList<>();
        transactions.add(new Transaction("Description", new BigDecimal(43), account, new Date()));

        Mockito.when(transactionRepository.findAll()).thenReturn(transactions);
    }

    @Test
    public void whenFindAllThenShouldReturnTransactionList() throws Exception {
        //transactionService.findAll()
    }
}
