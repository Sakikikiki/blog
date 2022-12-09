package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class VIP {
    private Integer id;
    private Integer userId;
    private User user;
    private Date startTime;
    private Date endTime;
}
