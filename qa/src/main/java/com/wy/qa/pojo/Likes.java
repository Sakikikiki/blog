package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Likes {
    private Integer likeId;
    private Integer replyId;
    private Post post;
    private Integer likerId;
    private User user;
    private Date createtime;
}
