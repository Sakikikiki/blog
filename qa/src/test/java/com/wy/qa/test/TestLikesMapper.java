package com.wy.qa.test;

import com.wy.qa.mapper.LikesMapper;
import com.wy.qa.pojo.Likes;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestLikesMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        LikesMapper likesMapper = sqlSession.getMapper(LikesMapper.class);
        Likes likes = new Likes();
        likes.setReplyId(4);
        likes.setLikerId(3);
        likesMapper.add(likes);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryLikesById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        LikesMapper likesMapper = sqlSession.getMapper(LikesMapper.class);
        System.out.println(likesMapper.queryLikesById(4));
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        LikesMapper likesMapper = sqlSession.getMapper(LikesMapper.class);
        likesMapper.del(3);
        sqlSession.commit();
        sqlSession.close();
    }
}
