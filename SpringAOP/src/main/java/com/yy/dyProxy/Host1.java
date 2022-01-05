package com.yy.dyProxy;

import com.yy.proxy.Rent;

/**
 * @author shkstart
 * @create 2021-12-30 19:11
 */
//真实角色 房东 要出租房子
public class Host1 implements Rent1 {
    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
