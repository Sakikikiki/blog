package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Del {
    private Integer delId;
    private String postTitle;
    private String postContent;
    private Integer authorId;
    private User author;
    private String reason;
    private Date delTime;
}
