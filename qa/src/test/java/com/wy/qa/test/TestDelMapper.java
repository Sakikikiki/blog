package com.wy.qa.test;

import com.wy.qa.mapper.DelMapper;
import com.wy.qa.mapper.PostMapper;
import com.wy.qa.pojo.Del;
import com.wy.qa.pojo.Post;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDelMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DelMapper delMapper = sqlSession.getMapper(DelMapper.class);
        Del del = new Del();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        Post post = postMapper.getById(3);
        del.setPostTitle(post.getTitle());
        del.setPostContent(post.getContent());
        del.setAuthorId(post.getUserId());
        del.setReason("标题不当");
        delMapper.add(del);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DelMapper delMapper = sqlSession.getMapper(DelMapper.class);
        System.out.println(delMapper.getById(3));
        sqlSession.close();
    }

    @Test
    public void queryAll() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DelMapper delMapper = sqlSession.getMapper(DelMapper.class);
        delMapper.queryAll().forEach(System.out::println);
        sqlSession.close();
    }
}
