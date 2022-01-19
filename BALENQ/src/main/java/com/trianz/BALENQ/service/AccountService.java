package com.trianz.BALENQ.service;

import com.trianz.BALENQ.dto.AccountDTO;
import com.trianz.BALENQ.service.httpservice.mip.MipAccountHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private MipAccountHttpClient accountHttpClient;

    public AccountDTO getAccountDetails(int id) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setId(id);
        AccountDTO response = accountHttpClient.getAccountDetails(accountDTO);
        return response;
    }

}
