package com.wy.qa.service;

import com.wy.qa.pojo.User;

public interface UserService {
    void register(User user);

    User login(String email, String pwd);

    void updatePwd(String curPwd, String newPwd, String confirmPwd, Integer userId);

    void updateSelfInfo(String username, Integer sex, String city, String motto, Integer userId);

    void updateAvatar(String filename, Integer userId);

    void charge(String cardId, String pwd, Integer number, Integer userId);

    void deduction(Integer number, Integer userId, Integer month);

    void del(Integer userId);
}
