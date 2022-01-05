package com.yy.dao;

/**
 * @author shkstart
 * @create 2021-12-30 17:08
 */
public class CP {
    public String name;
    private int age;

    public CP() {
    }

    public CP(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "CP{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
