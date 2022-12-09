package com.wy.qa.test;

import com.wy.qa.mapper.TagMapper;
import com.wy.qa.pojo.Tag;
import com.wy.qa.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTagMapper {
    @Test
    public void add() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TagMapper tagMapper = sqlSession.getMapper(TagMapper.class);
        Tag tag = new Tag();
        tag.setTagName("Mybatis");
        tagMapper.add(tag);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TagMapper tagMapper = sqlSession.getMapper(TagMapper.class);
        System.out.println(tagMapper.getById(3));
        sqlSession.close();
    }

    @Test
    public void del() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TagMapper tagMapper = sqlSession.getMapper(TagMapper.class);
        tagMapper.del(4);
        sqlSession.commit();
        sqlSession.close();
    }
}
