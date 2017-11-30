package com.viniciusps2.cashflow.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AccountRepository accountRepository;


    @Test
    public void whenFindAllTheReturn() {
        Account account = new Account("Banco X");
        entityManager.persist(account);
        entityManager.flush();

        List<Account> found = accountRepository.findAll();
        assertThat(found.get(0).getName()).isEqualTo(account.getName());
    }
}
