package com.wy.qa.service;

import com.wy.qa.pojo.VIP;

import java.util.Date;

public interface VIPService {
    void add(VIP vip);

    VIP getById(Integer userId);

    void updateTime(Date newEndTime, Integer userId);

    void del(Integer userId);
}
