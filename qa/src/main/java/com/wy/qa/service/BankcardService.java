package com.wy.qa.service;

import com.wy.qa.pojo.Bankcard;

public interface BankcardService {
    void add(Bankcard bankcard);

    Bankcard getById(Integer userId);

    void deduction(String cardId, Integer number);

    void del(String cardId);
}
