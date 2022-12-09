package com.wy.qa.service;

import com.wy.qa.pojo.Check;

public interface CheckService {
    void add(Check check);

    Check getById(Integer checkId);

    void del(Integer checkId);
}
