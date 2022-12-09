package com.wy.qa.test;

import com.wy.qa.mapper.CollectMapper;
import com.wy.qa.pojo.Collect;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestCollectMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CollectMapper collectMapper = sqlSession.getMapper(CollectMapper.class);
        Collect collect = new Collect();
        collect.setPostId(11);
        collect.setUserId(3);
        collectMapper.add(collect);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryByUserId() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CollectMapper collectMapper = sqlSession.getMapper(CollectMapper.class);
        collectMapper.queryByUserId(3).forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CollectMapper collectMapper = sqlSession.getMapper(CollectMapper.class);
        collectMapper.del(2);
        sqlSession.commit();
        sqlSession.close();
    }
}
