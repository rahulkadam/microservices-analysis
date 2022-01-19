package com.trianz.mip.mip.controller;

import com.trianz.mip.mip.dto.AccountDTO;
import com.trianz.mip.mip.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account/")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/details/{id}")
    public AccountDTO getAccountDetails(@PathVariable int id) {
       return accountService.getAccountDetails(id);
    }

}
