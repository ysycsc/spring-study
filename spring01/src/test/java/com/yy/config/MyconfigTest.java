package com.yy.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shkstart
 * @create 2021-12-30 17:59
 */
public class MyconfigTest {
    @Test
    public void Test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog)applicationContext.getBean("dog");
        System.out.println(dog);
    }
}
