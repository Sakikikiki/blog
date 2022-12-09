package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Post {
    private Integer postId;
    private String title;
    private String content;
    private Integer tagId;
    private Integer reward;
    private Integer status;
    private Integer topping;
    private Integer views;
    private Integer replies;
    private Integer collections;
    private Date createtime;
    private Integer userId;
    private User user;
}
