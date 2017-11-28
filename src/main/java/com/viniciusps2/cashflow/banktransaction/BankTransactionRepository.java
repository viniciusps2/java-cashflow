package com.viniciusps2.cashflow.banktransaction;


import com.viniciusps2.cashflow.bankaccount.BankAccount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "transaction", path = "transactions")
public interface BankTransactionRepository
        extends PagingAndSortingRepository<BankTransaction, Long> {


    @Query("SELECT b.* FROM BankTransaction b WHERE b.bank_account_id = :id")
    List<BankTransaction> findByBankAccount(@Param("id") Long id);

}
