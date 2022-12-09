package com.wy.qa.test;

import com.wy.qa.mapper.BankcardMapper;
import com.wy.qa.mapper.UserMapper;
import com.wy.qa.pojo.User;
import com.wy.qa.service.UserService;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserService {
    @Autowired
    private UserService userService;

    @Test
    public void add() throws InterruptedException {
        User user = new User();
        user.setUsername("wyyyyyyyyy");
        user.setPwd("wy602724432");
        user.setSex(1);
        user.setEmail("rick_roll@foxmail");
        userService.register(user);
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getById(3));
        sqlSession.close();
    }

    @Test
    public void updatePwd() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updatePwd("wy123456789", 3);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateSelfInfo() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateSelfInfo("你也好", 2, "北京", "感冒绷不住了", 3);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateAvatar() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateAvatar("bala.jpg", 3);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateRole() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deduction(100, 3);
//        BankcardMapper bankcardMapper = sqlSession.getMapper(BankcardMapper.class);
//        bankcardMapper.deduction("6212268202014638666", 10);
        userMapper.updateRole(3, 2);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateMoney() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        BankcardMapper bankcardMapper = sqlSession.getMapper(BankcardMapper.class);
        //先扣款后充值
        bankcardMapper.deduction("6212268202014638666", 30);
        userMapper.charge(30, 3);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.del(3);
        sqlSession.commit();
        sqlSession.close();
    }
}
