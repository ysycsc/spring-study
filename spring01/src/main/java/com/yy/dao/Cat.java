package com.yy.dao;

import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2021-12-30 17:17
 */
@Component("cat")
public class Cat {
    public void shout(){
        System.out.println("miao~");
    }
}
