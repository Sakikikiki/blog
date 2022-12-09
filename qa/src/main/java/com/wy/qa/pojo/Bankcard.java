package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bankcard {
    private Integer seqId;
    private String cardId;
    private String cardPwd;
    private Integer balance;
    private Integer userId;
    private User user;
}
