package com.yy.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2021-12-30 17:23
 */
public class UserTest {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        User user = (User)context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
    }
}
