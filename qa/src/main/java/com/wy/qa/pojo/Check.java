package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class Check {
    private Integer checkId;
    private Integer reportId;
    private Report report;
    private String result;
    private Date checkTime;
}
