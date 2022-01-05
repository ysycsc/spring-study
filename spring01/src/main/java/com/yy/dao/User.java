package com.yy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2021-12-30 17:19
 */
@Component("user")
public class User {
    @Autowired(required = false) //对象可以为null required = true 对象必须存在 不能为null
    @Qualifier //不能单独使用  加上@Qualifier则可以根据byname的方式自动装配
    private Cat cat;
    @Autowired  //根据类型自动装配的
    private Dog dog;
    private String str;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "User{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", str='" + str + '\'' +
                '}';
    }
}
