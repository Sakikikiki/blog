package com.wy.qa.service;

import com.wy.qa.pojo.Collect;

import java.util.List;

public interface CollectService {
    void add(Collect collect);

    List<Collect> queryByUserId(Integer userId);

    void del(Integer collectionId);
}
