package com.trianz.BALENQ.service;

import com.trianz.BALENQ.constants.ApplicationConstant;
import com.trianz.BALENQ.dto.BalanceEnquiryDTO;
import org.springframework.stereotype.Service;

@Service
public class CustomerBalanceService {


    public BalanceEnquiryDTO getCustomerBalance(BalanceEnquiryDTO balanceEnquiryDTO) {
       String  msisdn= balanceEnquiryDTO.getMsisdn();
        if(!validator(msisdn)) {
            balanceEnquiryDTO.setErrorMsg(ApplicationConstant.INVALID_MSISDN);
            return balanceEnquiryDTO;
        } else {
            long customerBalance = getBalanceByMsisdn(msisdn);
            balanceEnquiryDTO.setBalance(customerBalance);
        }
        return balanceEnquiryDTO;
    }

    public long  getBalanceByMsisdn(String msisdn){
        String balance= msisdn.substring(6);
        return  Long.parseLong(balance);
    }

    public boolean validator(String msisdn){
        String ptrn = "[0-9]+";
        return msisdn.matches(ptrn) &&  msisdn.length()==10;
    }

}
