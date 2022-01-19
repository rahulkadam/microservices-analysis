package com.trianz.BALENQ.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TransactionDTO {

    public AccountDTO from;
    public AccountDTO to;
    public TransactionRequestType requestType;
    public int id;
    public String desc;
    public Long amount;

    public static TransactionDTO getRandomTransactionDTO() {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setDesc(" Random - Transaction");
        transactionDTO.setId((int)Math.random()*100);
        return transactionDTO;
    }

    public static TransactionDTO getRandomTransactionDTO(int id) {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setDesc(" Random - Transaction");
        transactionDTO.setId(id);
        transactionDTO.setRequestType(TransactionRequestType.CREDIT);
        return transactionDTO;
    }
}
