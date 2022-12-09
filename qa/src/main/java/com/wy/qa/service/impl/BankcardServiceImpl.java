package com.wy.qa.service.impl;

import com.wy.qa.mapper.BankcardMapper;
import com.wy.qa.pojo.Bankcard;
import com.wy.qa.service.BankcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("bankcardService")
public class BankcardServiceImpl implements BankcardService {
    private final BankcardMapper bankcardMapper;

    @Autowired
    public BankcardServiceImpl(BankcardMapper bankcardMapper) {
        this.bankcardMapper = bankcardMapper;
    }

    @Transactional
    @Override
    public void add(Bankcard bankcard) {
        bankcardMapper.add(bankcard);
    }

    @Override
    public Bankcard getById(Integer userId) {
        return bankcardMapper.getById(userId);
    }

    @Transactional
    @Override
    public void deduction(String cardId, Integer number) {
        bankcardMapper.deduction(cardId, number);
    }

    @Transactional
    @Override
    public void del(String cardId) {
        bankcardMapper.del(cardId);
    }
}
