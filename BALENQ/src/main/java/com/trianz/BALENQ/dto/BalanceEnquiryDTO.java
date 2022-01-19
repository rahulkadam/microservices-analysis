package com.trianz.BALENQ.dto;


import org.springframework.stereotype.Component;

@Component
public class BalanceEnquiryDTO {

    public String msisdn;
    public String name;
    public String errorMsg;
    public long balance;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public BalanceEnquiryDTO(){

    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BalanceEnquiryDTO(String msisdn, String name, String errorMsg) {
        this.msisdn = msisdn;
        this.name = name;
        this.errorMsg=errorMsg;
    }




}
