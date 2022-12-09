package com.wy.qa.service.impl;

import com.wy.qa.mapper.ReplyMapper;
import com.wy.qa.pojo.Reply;
import com.wy.qa.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService {
    private final ReplyMapper replyMapper;

    @Autowired
    public ReplyServiceImpl(ReplyMapper replyMapper) {
        this.replyMapper = replyMapper;
    }

    @Transactional
    @Override
    public void add(Reply reply) {
        replyMapper.add(reply);
    }

    @Override
    public Reply getById(Integer replyId) {
        return replyMapper.getById(replyId);
    }

    @Override
    public List<Reply> queryByIdAndSize(Integer userId, Integer size) {
        return replyMapper.queryByIdAndSize(userId, size);
    }

    @Override
    public List<Reply> queryAllById(Integer postId) {
        return replyMapper.queryAllById(postId);
    }

    @Transactional
    @Override
    public void updateLikes(Integer replyId, Integer number) {
        replyMapper.updateLikes(replyId, number);
    }

    @Transactional
    @Override
    public void del(Integer replyId) {
        replyMapper.del(replyId);
    }
}
