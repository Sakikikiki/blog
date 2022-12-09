package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Report {
    private Integer reportId;
    private Integer postId;
    private Post post;
    private Integer userId;
    private User user;
    private String title;
    private String reason;
    private Integer status;
    private Date reportTime;
}
