package com.wy.qa.test;

import com.wy.qa.mapper.VIPMapper;
import com.wy.qa.pojo.VIP;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestVIPMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        VIPMapper vipMapper = sqlSession.getMapper(VIPMapper.class);
        VIP vip = new VIP();
        vip.setUserId(2);
        Date startTime = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        calendar.add(Calendar.MONTH, 1);
        Date endTime = calendar.getTime();
        vip.setStartTime(startTime);
        vip.setEndTime(endTime);
        vipMapper.add(vip);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        VIPMapper vipMapper = sqlSession.getMapper(VIPMapper.class);
        System.out.println(vipMapper.getById(3));
        sqlSession.close();
    }

    @Test
    public void updateTime() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        VIPMapper vipMapper = sqlSession.getMapper(VIPMapper.class);
        Date oldEndTime = vipMapper.getById(3).getEndTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(oldEndTime);
        calendar.add(Calendar.MONTH, 1);
        Date newEndTime = calendar.getTime();
        vipMapper.updateTime(newEndTime, 3);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        VIPMapper vipMapper = sqlSession.getMapper(VIPMapper.class);
        vipMapper.del(2);
        sqlSession.commit();
        sqlSession.close();
    }
}
