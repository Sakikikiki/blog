package com.wy.qa.service.impl;

import com.wy.qa.mapper.DelMapper;
import com.wy.qa.pojo.Del;
import com.wy.qa.service.DelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("delService")
public class DelServiceImpl implements DelService {
    private final DelMapper delMapper;

    @Autowired
    public DelServiceImpl(DelMapper delMapper) {
        this.delMapper = delMapper;
    }

    @Transactional
    @Override
    public void add(Del del) {
        delMapper.add(del);
    }

    @Override
    public Del getById(Integer delId) {
        return delMapper.getById(delId);
    }

    @Override
    public List<Del> queryAll() {
        return delMapper.queryAll();
    }
}
