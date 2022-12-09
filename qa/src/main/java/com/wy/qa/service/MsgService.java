package com.wy.qa.service;

import com.wy.qa.pojo.Msg;

import java.util.List;

public interface MsgService {
    void add(Msg msg);

    Msg getById(Integer msgId);

    List<Msg> queryById(Integer recipientId);

    void updateStatus(Integer msgId);

    void updateAllStatus();

    void del(Integer msgId);

    void delAll(Integer recipientId);
}
