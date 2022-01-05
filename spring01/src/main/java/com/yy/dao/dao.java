package com.yy.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2021-12-30 14:48
 */
@Component("dao")
public class dao {
    @Value("小菜鸡")
    public String str;

    public dao() {
        System.out.println("dao的无参构造函数");
    }

    public dao(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
        @Value("大菜鸡")
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "dao{" +
                "str='" + str + '\'' +
                '}';
    }
}
