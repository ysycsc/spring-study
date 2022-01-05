package com.yy.dao;

import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2021-12-30 17:18
 */
@Component("dog")
public class Dog {
    public void shout(){
        System.out.println("wang~");
    }
}
