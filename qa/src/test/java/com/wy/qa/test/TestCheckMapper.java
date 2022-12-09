package com.wy.qa.test;

import com.wy.qa.mapper.CheckMapper;
import com.wy.qa.pojo.Check;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestCheckMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CheckMapper checkMapper = sqlSession.getMapper(CheckMapper.class);
        Check check = new Check();
        check.setReportId(4);
        check.setResult("举报有效");
        checkMapper.add(check);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CheckMapper checkMapper = sqlSession.getMapper(CheckMapper.class);
        System.out.println(checkMapper.getById(2));
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CheckMapper checkMapper = sqlSession.getMapper(CheckMapper.class);
        checkMapper.del(3);
        sqlSession.commit();
        sqlSession.close();
    }
}
