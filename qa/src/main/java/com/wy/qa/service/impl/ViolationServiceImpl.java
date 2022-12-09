package com.wy.qa.service.impl;

import com.wy.qa.mapper.ViolationMapper;
import com.wy.qa.pojo.Violation;
import com.wy.qa.service.ViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("violationService")
public class ViolationServiceImpl implements ViolationService {
    private final ViolationMapper violationMapper;

    @Autowired
    public ViolationServiceImpl(ViolationMapper violationMapper) {
        this.violationMapper = violationMapper;
    }

    @Transactional
    @Override
    public void add(Violation violation) {
        violationMapper.add(violation);
    }

    @Override
    public Violation getById(Integer userId) {
        return violationMapper.getById(userId);
    }

    @Transactional
    @Override
    public void updateVio(Integer userId) {
        violationMapper.updateVio(userId);
    }

    @Transactional
    @Override
    public void del(Integer userId) {
        violationMapper.del(userId);
    }
}
