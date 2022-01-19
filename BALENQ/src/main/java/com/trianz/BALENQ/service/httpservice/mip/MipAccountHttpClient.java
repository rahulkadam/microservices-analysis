package com.trianz.BALENQ.service.httpservice.mip;

import com.trianz.BALENQ.dto.AccountDTO;
import com.trianz.BALENQ.dto.TransactionDTO;
import com.trianz.BALENQ.properties.MIPProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MipAccountHttpClient {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MIPProperties mipProperties;

    public AccountDTO getAccountDetails(AccountDTO accountDTO) {
        HttpEntity<AccountDTO> request = new HttpEntity<>(accountDTO);
        String url = mipProperties.getUrl();
        String fullUrl = url + "/account/details";
        AccountDTO accountDTOResponse = restTemplate.postForObject(fullUrl, request, AccountDTO.class);
        return accountDTOResponse;
    }
}
