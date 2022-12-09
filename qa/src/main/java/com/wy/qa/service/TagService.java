package com.wy.qa.service;

import com.wy.qa.pojo.Tag;

public interface TagService {
    void add(Tag tag);

    Tag getById(Integer tagId);

    void del(Integer tagId);
}
