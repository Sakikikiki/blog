package com.wy.qa.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class User {
    private Integer userId;
    private String username;
    private String pwd;
    private Integer sex;
    private String email;
    private String city;
    private String avatar;
    private String motto;
    private Integer money;
    private Integer status;
    private Date createtime;
    //一个用户对应一个角色
    private Integer roleId;
    private Role role;
}
