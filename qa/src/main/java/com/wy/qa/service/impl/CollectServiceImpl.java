package com.wy.qa.service.impl;

import com.wy.qa.mapper.CollectMapper;
import com.wy.qa.pojo.Collect;
import com.wy.qa.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("collectService")
public class CollectServiceImpl implements CollectService {
    private final CollectMapper collectMapper;

    @Autowired
    public CollectServiceImpl(CollectMapper collectMapper) {
        this.collectMapper = collectMapper;
    }

    @Transactional
    @Override
    public void add(Collect collect) {
        collectMapper.add(collect);
    }

    @Override
    public List<Collect> queryByUserId(Integer userId) {
        return collectMapper.queryByUserId(userId);
    }

    @Transactional
    @Override
    public void del(Integer collectionId) {
        collectMapper.del(collectionId);
    }
}
