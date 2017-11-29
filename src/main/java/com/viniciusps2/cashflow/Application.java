package com.viniciusps2.cashflow;

import com.viniciusps2.cashflow.account.Account;
import com.viniciusps2.cashflow.account.AccountRepository;
import com.viniciusps2.cashflow.transaction.Transaction;
import com.viniciusps2.cashflow.transaction.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = RepositoryRestMvcAutoConfiguration.class)
@EntityScan
@EnableJpaRepositories
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
