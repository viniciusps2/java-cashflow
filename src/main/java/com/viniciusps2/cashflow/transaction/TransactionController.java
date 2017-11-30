package com.viniciusps2.cashflow.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {


    public static final Logger logger = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(method = GET)
    public Page<Transaction> list(@PageableDefault(sort = { "viewDate"}) Pageable pageRequest
    ) {
        return transactionService.findAll(pageRequest);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = POST)
    public Transaction save(@RequestBody Transaction transaction) {
        transactionRepository.save(transaction);
        return transaction;
    }

    @RequestMapping(value = "/{id}", method = GET)
    public Transaction read(@PathVariable(value = "id") long id) {
        return transactionRepository.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = PUT)
    public Transaction update(@PathVariable(value = "id") long id, @RequestBody Transaction transaction) {
        transactionRepository.save(transaction);
        return transaction;
    }

    @RequestMapping(value = "/{id}", method = DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        transactionRepository.delete(id);
    }
}
