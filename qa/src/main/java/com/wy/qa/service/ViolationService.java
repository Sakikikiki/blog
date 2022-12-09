package com.wy.qa.service;

import com.wy.qa.pojo.Violation;

public interface ViolationService {
    void add(Violation violation);

    Violation getById(Integer userId);

    void updateVio(Integer userId);

    void del(Integer userId);
}
