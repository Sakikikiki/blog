package com.wy.qa.service.impl;

import com.wy.qa.mapper.MsgMapper;
import com.wy.qa.pojo.Msg;
import com.wy.qa.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("msgService")
public class MsgServiceImpl implements MsgService {
    private final MsgMapper msgMapper;

    @Autowired
    public MsgServiceImpl(MsgMapper msgMapper) {
        this.msgMapper = msgMapper;
    }

    @Transactional
    @Override
    public void add(Msg msg) {
        msgMapper.add(msg);
    }

    @Override
    public Msg getById(Integer msgId) {
        return msgMapper.getById(msgId);
    }

    @Override
    public List<Msg> queryById(Integer recipientId) {
        return msgMapper.queryById(recipientId);
    }

    @Transactional
    @Override
    public void updateStatus(Integer msgId) {
        msgMapper.updateStatus(msgId);
    }

    @Transactional
    @Override
    public void updateAllStatus() {
        msgMapper.updateAllStatus();
    }

    @Transactional
    @Override
    public void del(Integer msgId) {
        msgMapper.del(msgId);
    }

    @Transactional
    @Override
    public void delAll(Integer recipientId) {
        msgMapper.delAll(recipientId);
    }
}
