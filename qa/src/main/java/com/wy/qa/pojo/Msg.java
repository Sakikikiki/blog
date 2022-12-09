package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Msg {
    private Integer msgId;
    private Integer senderId;
    private User sender;
    private Integer recipientId;
    private User recipient;
    private String content;
    private Integer status;
    private Date sendTime;
}
