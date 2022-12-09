package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Reply {
    private Integer replyId;
    private String content;
    private Integer status;
    private Integer likes;
    private Integer postId;
    private Post post;
    private Integer userId;
    private User user;
    private Date replyTime;
}
