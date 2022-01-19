package com.trianz.mip.mip.controller;

import com.trianz.mip.mip.dto.TransactionDTO;
import com.trianz.mip.mip.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/transaction/")
public class TransactionController {

    @Autowired
    public TransactionService transactionService;

    @GetMapping(value = "/details/{id}")
    public TransactionDTO getTransactionDetails(@PathVariable int id) {
        return transactionService.getTransactionDetails(id);
    }

    @PostMapping(value = "action")
    public TransactionDTO performTransaction(@RequestBody TransactionDTO transactionDTO) {
        return transactionService.executeTransaction(transactionDTO);
    }
}
