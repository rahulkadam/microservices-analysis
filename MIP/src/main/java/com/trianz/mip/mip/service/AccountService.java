package com.trianz.mip.mip.service;

import com.trianz.mip.mip.dto.AccountDTO;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public AccountDTO getAccountDetails(int id) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setBalance(102l);
        accountDTO.setStatus(true);
        accountDTO.setName("Random users");
        accountDTO.setId(id);
        return accountDTO;
    }

    public AccountDTO getAccountDetails(AccountDTO accountDTO) {
        accountDTO.setBalance(102l);
        accountDTO.setName("Random users");
        return accountDTO;
    }
}
