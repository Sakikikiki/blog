package com.wy.qa.test;

import com.wy.qa.mapper.BankcardMapper;
import com.wy.qa.pojo.Bankcard;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestBankcardMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BankcardMapper bankcardMapper = sqlSession.getMapper(BankcardMapper.class);
        Bankcard bankcard = new Bankcard();
        bankcard.setCardId("6212268202014638777");
        bankcard.setCardPwd("test");
        bankcard.setBalance(700);
        bankcard.setUserId(30);
        bankcardMapper.add(bankcard);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BankcardMapper bankcardMapper = sqlSession.getMapper(BankcardMapper.class);
        System.out.println(bankcardMapper.getById(30));
        sqlSession.close();
    }

    @Test
    public void deduction() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BankcardMapper bankcardMapper = sqlSession.getMapper(BankcardMapper.class);
        bankcardMapper.deduction("6212268202014638999", 50);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BankcardMapper bankcardMapper = sqlSession.getMapper(BankcardMapper.class);
        bankcardMapper.del("6212268202014638110");
        sqlSession.commit();
        sqlSession.close();
    }
}
