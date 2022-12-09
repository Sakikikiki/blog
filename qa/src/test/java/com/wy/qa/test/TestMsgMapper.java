package com.wy.qa.test;

import com.wy.qa.mapper.MsgMapper;
import com.wy.qa.pojo.Msg;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMsgMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        MsgMapper msgMapper = sqlSession.getMapper(MsgMapper.class);
        Msg msg = new Msg();
        msg.setSenderId(3);
        msg.setRecipientId(2);
        msg.setContent("你好好好");
        msgMapper.add(msg);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        MsgMapper msgMapper = sqlSession.getMapper(MsgMapper.class);
        System.out.println(msgMapper.getById(2));
        sqlSession.close();
    }

    @Test
    public void queryById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        MsgMapper msgMapper = sqlSession.getMapper(MsgMapper.class);
        msgMapper.queryById(2).forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void updateStatus() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        MsgMapper msgMapper = sqlSession.getMapper(MsgMapper.class);
        msgMapper.updateStatus(2);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        MsgMapper msgMapper = sqlSession.getMapper(MsgMapper.class);
        msgMapper.del(2);
        sqlSession.commit();
        sqlSession.close();
    }
}
