package com.wy.qa.service;

import com.wy.qa.pojo.Likes;

public interface LikesService {
    void add(Likes likes);

    Integer queryLikesById(Integer replyId);

    void del(Integer likerId);
}
