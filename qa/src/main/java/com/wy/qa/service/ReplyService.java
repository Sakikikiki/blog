package com.wy.qa.service;

import com.wy.qa.pojo.Reply;

import java.util.List;

public interface ReplyService {
    void add(Reply reply);

    Reply getById(Integer replyId);

    List<Reply> queryByIdAndSize(Integer userId, Integer size);

    List<Reply> queryAllById(Integer postId);

    void updateLikes(Integer replyId, Integer number);

    void del(Integer replyId);
}
