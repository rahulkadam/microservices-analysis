package com.trianz.BALENQ.serviceImpl;

import com.trianz.BALENQ.constants.ApplicationConstant;
import com.trianz.BALENQ.dto.BalanceEnquiryDTO;
import com.trianz.BALENQ.service.CustomerBalanceEnquiry;
import org.springframework.stereotype.Service;

@Service
public class CustomerBalanceService implements CustomerBalanceEnquiry {


    @Override
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
        return  Long.valueOf(balance);
    }

    public boolean validator(String msisdn){
        String ptrn = "[0-9]+";
        return msisdn.matches(ptrn) &&  msisdn.length()==10;
    }

     /* @GetMapping(value = "/balanceEnquiry/{msisdn}", produces = "application/json")
    public String customerBalanceEnquiry2(@PathVariable String msisdn){
            if(!validator(msisdn)){
                return INVALID_MSISDN;
            }else if( msisdn.length()!=10 ) {
                return INVALID_MSISDN;
            }

        return msisdn.substring(6);
    }

    public boolean validator(String msisdn){
        String ptrn = "[0-9]+";
        return msisdn.matches(ptrn);
    }*/
}
