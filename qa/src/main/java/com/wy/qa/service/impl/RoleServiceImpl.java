package com.wy.qa.service.impl;

import com.wy.qa.mapper.RoleMapper;
import com.wy.qa.pojo.Role;
import com.wy.qa.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
    private final RoleMapper roleMapper;

    @Autowired
    public RoleServiceImpl(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }


    @Override
    public void add(Role role) {
        roleMapper.add(role);
    }

    @Override
    public Role getById(Integer roleId) {
        return roleMapper.getById(roleId);
    }

    @Override
    public void del(Integer roleId) {
        roleMapper.del(roleId);
    }
}
