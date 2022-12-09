package com.wy.qa.test;

import com.wy.qa.util.RandomUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUtil {
    @Test
    public void util() {
        String question = RandomUtil.generateQuestion();
        System.out.println(question.substring(0, 5));
        System.out.print(question.substring(5));
    }

}
