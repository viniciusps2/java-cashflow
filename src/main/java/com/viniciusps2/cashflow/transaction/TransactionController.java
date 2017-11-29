package com.viniciusps2.cashflow.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {


    public static final Logger logger = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    private TransactionRepository transactionRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Transaction> list() {
        return transactionRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public Transaction save(@RequestBody Transaction transaction) {
        transactionRepository.save(transaction);
        return transaction;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Transaction read(@PathVariable(value = "id") long id) {
        return transactionRepository.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Transaction update(@PathVariable(value = "id") long id, @RequestBody Transaction transaction) {
        transactionRepository.save(transaction);
        return transaction;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        transactionRepository.delete(id);
    }
}
