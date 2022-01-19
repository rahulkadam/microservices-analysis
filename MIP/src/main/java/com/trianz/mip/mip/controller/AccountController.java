package com.trianz.mip.mip.controller;

import com.trianz.mip.mip.dto.AccountDTO;
import com.trianz.mip.mip.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/account/")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/details/{id}")
    public AccountDTO getAccountDetails(@PathVariable int id) {
       return accountService.getAccountDetails(id);
    }

    @PostMapping(value = "/details")
    public AccountDTO getAccountDetails(@RequestBody AccountDTO accountDTO) {
        return accountService.getAccountDetails(accountDTO);
    }

}
