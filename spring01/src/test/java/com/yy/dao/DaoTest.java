package com.yy.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2021-12-30 14:52
 */
public class DaoTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        dao dao = (dao)context.getBean("dao");
        String str = dao.getStr();
        System.out.println(str);
    }
}
