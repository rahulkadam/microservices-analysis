package com.trianz.BALENQ.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountDTO {
    public int id;
    public String name;
    public Long balance;
    public boolean status;
}
