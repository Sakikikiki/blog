package com.wy.qa.service.impl;

import com.wy.qa.mapper.VIPMapper;
import com.wy.qa.pojo.VIP;
import com.wy.qa.service.VIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service("VIPService")
public class VIPServiceImpl implements VIPService {
    private final VIPMapper vipMapper;

    @Autowired
    public VIPServiceImpl(VIPMapper vipMapper) {
        this.vipMapper = vipMapper;
    }

    @Transactional
    @Override
    public void add(VIP vip) {
        vipMapper.add(vip);
    }

    @Override
    public VIP getById(Integer userId) {
        return vipMapper.getById(userId);
    }

    @Transactional
    @Override
    public void updateTime(Date newEndTime, Integer userId) {
        vipMapper.updateTime(newEndTime, userId);
    }

    @Transactional
    @Override
    public void del(Integer userId) {
        vipMapper.del(userId);
    }
}
