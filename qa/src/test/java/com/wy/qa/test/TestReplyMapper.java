package com.wy.qa.test;

import com.wy.qa.mapper.LikesMapper;
import com.wy.qa.mapper.ReplyMapper;
import com.wy.qa.pojo.Reply;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestReplyMapper {
    @Test
    public void add() throws InterruptedException {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReplyMapper replyMapper = sqlSession.getMapper(ReplyMapper.class);
        for (int i = 3; i < 19; i++) {
            Reply reply = new Reply();
            reply.setContent("今天可能要下雨" + i);
            reply.setPostId(11);
            reply.setUserId(3);
            replyMapper.add(reply);
            Thread.sleep(1000);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReplyMapper replyMapper = sqlSession.getMapper(ReplyMapper.class);
        System.out.println(replyMapper.getById(2));
        sqlSession.close();
    }

    @Test
    public void queryByIdAndSize() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReplyMapper replyMapper = sqlSession.getMapper(ReplyMapper.class);
        replyMapper.queryByIdAndSize(3, 10).forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void queryAllById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReplyMapper replyMapper = sqlSession.getMapper(ReplyMapper.class);
        replyMapper.queryAllById(11).forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void updateLikes() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReplyMapper replyMapper = sqlSession.getMapper(ReplyMapper.class);
        LikesMapper likesMapper = sqlSession.getMapper(LikesMapper.class);
        Integer number = likesMapper.queryLikesById(4);
        replyMapper.updateLikes(4, number);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReplyMapper replyMapper = sqlSession.getMapper(ReplyMapper.class);
        replyMapper.del(2);
        sqlSession.commit();
        sqlSession.close();
    }
}
