package com.wy.qa.service.impl;

import com.wy.qa.mapper.LikesMapper;
import com.wy.qa.pojo.Likes;
import com.wy.qa.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("likesService")
public class LikesServiceImpl implements LikesService {
    private final LikesMapper likesMapper;

    @Autowired
    public LikesServiceImpl(LikesMapper likesMapper) {
        this.likesMapper = likesMapper;
    }

    @Transactional
    @Override
    public void add(Likes likes) {
        likesMapper.add(likes);
    }

    @Override
    public Integer queryLikesById(Integer replyId) {
        return likesMapper.queryLikesById(replyId);
    }

    @Transactional
    @Override
    public void del(Integer likerId) {
        likesMapper.del(likerId);
    }
}
