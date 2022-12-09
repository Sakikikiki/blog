package com.wy.qa.test;

import com.wy.qa.mapper.ViolationMapper;
import com.wy.qa.pojo.Violation;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestViolationMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ViolationMapper violationMapper = sqlSession.getMapper(ViolationMapper.class);
        Violation violation = new Violation();
        violation.setUserId(33);
        violationMapper.add(violation);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ViolationMapper violationMapper = sqlSession.getMapper(ViolationMapper.class);
        System.out.println(violationMapper.getById(30));
        sqlSession.close();
    }

    @Test
    public void updateVio() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ViolationMapper violationMapper = sqlSession.getMapper(ViolationMapper.class);
        violationMapper.updateVio(31);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ViolationMapper violationMapper = sqlSession.getMapper(ViolationMapper.class);
        violationMapper.del(33);
        sqlSession.commit();
        sqlSession.close();
    }
}
