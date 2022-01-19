package com.trianz.BALENQ.service;


import com.trianz.BALENQ.dto.BalanceEnquiryDTO;
import org.springframework.stereotype.Service;

@Service
public interface CustomerBalanceEnquiry {
    public BalanceEnquiryDTO getCustomerBalance(BalanceEnquiryDTO balanceEnquiryDTO);
}
