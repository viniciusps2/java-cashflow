package com.viniciusps2.cashflow.banktransaction;

import com.viniciusps2.cashflow.bankaccount.BankAccount;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bank_account_id")
    private BankAccount bankAccount;

    private Double value;
    private Date clearingDate;
    private Date dueDate;

    public BankTransaction() {
    }
}
