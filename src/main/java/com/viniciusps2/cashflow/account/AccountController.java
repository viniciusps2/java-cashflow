package com.viniciusps2.cashflow.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Account> list() {
        return accountRepository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public Account save(Account account) {
        accountRepository.save(account);
        return account;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account read(@PathVariable(value = "id") long id) {
        return accountRepository.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Account update(@PathVariable(value = "id") long id, @RequestBody Account account) {
        accountRepository.save(account);
        return account;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable(value = "id") long id) {
        accountRepository.delete(id);
    }


}
