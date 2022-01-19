package com.trianz.mip.mip.service;

import com.trianz.mip.mip.dto.TransactionDTO;
import org.springframework.stereotype.Service;


@Service
public class TransactionService {

    public TransactionDTO getTransactionDetails(int id) {
        return TransactionDTO.getRandomTransactionDTO(id);
    }

    public TransactionDTO executeTransaction(TransactionDTO transactionDTO) {
        Long fromUserBalance = transactionDTO.getFrom().getBalance();
        transactionDTO.getFrom().setBalance(fromUserBalance- transactionDTO.getAmount());
        Long toUserBalance = transactionDTO.getTo().getBalance();
        transactionDTO.getTo().setBalance(toUserBalance + transactionDTO.getAmount());
        return transactionDTO;
    }

}
