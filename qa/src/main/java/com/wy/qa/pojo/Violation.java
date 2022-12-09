package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Violation {
    private Integer vioId;
    private Integer userId;
    private User user;
    private Integer vioTimes;
}
