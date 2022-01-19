package com.trianz.BALENQ.controller;

import com.trianz.BALENQ.dto.BalanceEnquiryDTO;
import com.trianz.BALENQ.service.CustomerBalanceEnquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/balanceEnquiry")
public class BalanceEnquiryController {

    @Autowired
    private CustomerBalanceEnquiry customerBalanceEnquiry;

    @PostMapping(value = "/balance", produces = "application/json")
    public BalanceEnquiryDTO getBalance(@RequestBody BalanceEnquiryDTO balanceEnquiryDTO) {
        return customerBalanceEnquiry.getCustomerBalance(balanceEnquiryDTO);
    }

}
