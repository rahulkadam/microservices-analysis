package com.trianz.BALENQ.service.httpservice.mip;

import com.trianz.BALENQ.dto.TransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MIPTransactionClient {

    @Autowired
    private RestTemplate restTemplate;

    public TransactionDTO executeTransaction(TransactionDTO transactionDTO) {
        HttpEntity<TransactionDTO> request = new HttpEntity<>(transactionDTO);
        String url = "http://localhost:8089/transaction/action";
        TransactionDTO transactionDTO1 = restTemplate.postForObject(url, request, TransactionDTO.class);
        return transactionDTO1;
    }
}
