package com.wy.qa.test;

import com.wy.qa.mapper.PostMapper;
import com.wy.qa.pojo.Post;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestPostMapper {
    @Test
    public void add() throws InterruptedException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        for (int i = 0; i < 20; i++) {
            Post post = new Post();
            post.setTitle("title" + i);
            post.setContent("content" + i);
            post.setTagId(2);
            post.setReward(60);
            post.setUserId(2);
            postMapper.add(post);
            Thread.sleep(1000);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        System.out.println(postMapper.getById(4));
        sqlSession.close();
    }

    @Test
    public void queryAllByPage() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        postMapper.queryAllByPage(null, 1, 30).forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void querySelfByPage() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        postMapper.querySelfByPage(2, 1, 10).forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void queryByTopping() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        postMapper.queryByTopping(1).forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void queryByStatus() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        postMapper.queryByStatus(1).forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void orderByViews() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        postMapper.orderByViews().forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void orderByReplies() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        postMapper.orderByReplies().forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void updatePost() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        postMapper.updatePost("afterTitle", "afterContent", 3, 4);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateReplies() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        postMapper.updateReplies(4, 30);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateStatus() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        for (int i = 6; i < 10; i++) {
            postMapper.updateStatus(i, 1);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        postMapper.del(3);
        sqlSession.commit();
        sqlSession.close();
    }
}
