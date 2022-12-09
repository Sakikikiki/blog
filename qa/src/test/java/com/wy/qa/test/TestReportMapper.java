package com.wy.qa.test;

import com.wy.qa.mapper.ReportMapper;
import com.wy.qa.pojo.Report;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestReportMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReportMapper reportMapper = sqlSession.getMapper(ReportMapper.class);
        Report report = new Report();
        report.setPostId(20);
        report.setUserId(2);
        report.setTitle("后天星期六");
        report.setReason("又是你妈的会战");
        reportMapper.add(report);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReportMapper reportMapper = sqlSession.getMapper(ReportMapper.class);
        System.out.println(reportMapper.getById(2));
        sqlSession.close();
    }

    @Test
    public void queryReportByStatus() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReportMapper reportMapper = sqlSession.getMapper(ReportMapper.class);
        reportMapper.queryReportByStatus(2).forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void updateStatus() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReportMapper reportMapper = sqlSession.getMapper(ReportMapper.class);
        reportMapper.updateStatus(3);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ReportMapper reportMapper = sqlSession.getMapper(ReportMapper.class);
        reportMapper.del(2);
        sqlSession.commit();
        sqlSession.close();
    }
}
