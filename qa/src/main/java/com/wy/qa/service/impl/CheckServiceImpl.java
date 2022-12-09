package com.wy.qa.service.impl;

import com.wy.qa.mapper.CheckMapper;
import com.wy.qa.pojo.Check;
import com.wy.qa.service.CheckService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("checkService")
public class CheckServiceImpl implements CheckService {
    private final CheckMapper checkMapper;

    public CheckServiceImpl(CheckMapper checkMapper) {
        this.checkMapper = checkMapper;
    }

    @Transactional
    @Override
    public void add(Check check) {
        checkMapper.add(check);
    }

    @Override
    public Check getById(Integer checkId) {
        return checkMapper.getById(checkId);
    }

    @Transactional
    @Override
    public void del(Integer checkId) {
        checkMapper.del(checkId);
    }
}
