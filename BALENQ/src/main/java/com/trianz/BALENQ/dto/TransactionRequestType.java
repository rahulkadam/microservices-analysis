package com.trianz.BALENQ.dto;

public enum TransactionRequestType {
    CREDIT("CR"), DEBIT("DB");

    private String type;
    TransactionRequestType(String type) {
        this.type = type;
    }

    public String getRequestType() {
        return type;
    }

    public String getRequestType(TransactionRequestType transactionRequestType) {
        return transactionRequestType.type;
    }
}
