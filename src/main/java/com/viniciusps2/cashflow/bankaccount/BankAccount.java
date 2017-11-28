package com.viniciusps2.cashflow.bankaccount;

import com.viniciusps2.cashflow.banktransaction.BankTransaction;

import javax.persistence.*;
import java.util.List;

@Entity
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bankName;
    private String agency;
    private String number;

    @OneToMany(mappedBy = "bankAccount")
    private List<BankTransaction> transactions;

    public BankAccount() {
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", agency='" + agency + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
