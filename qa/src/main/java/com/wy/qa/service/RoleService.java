package com.wy.qa.service;

import com.wy.qa.pojo.Role;

public interface RoleService {
    void add(Role role);

    Role getById(Integer roleId);

    void del(Integer roleId);
}
