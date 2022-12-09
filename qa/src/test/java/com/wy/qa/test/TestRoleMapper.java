package com.wy.qa.test;

import com.wy.qa.mapper.RoleMapper;
import com.wy.qa.pojo.Role;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestRoleMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role();
        role.setRoleId(5);
        role.setRoleName("TEST");
        roleMapper.add(role);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        System.out.println(roleMapper.getById(5));
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        roleMapper.del(4);
        sqlSession.commit();
        sqlSession.close();
    }
}
