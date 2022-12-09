package com.wy.qa.service;

import com.wy.qa.pojo.Del;

import java.util.List;

public interface DelService {
    void add(Del del);

    Del getById(Integer delId);

    List<Del> queryAll();
}
