package com.yy.dyProxy;

import com.yy.proxy.Host;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author shkstart
 * @create 2021-12-30 19:13
 */
//代理角色 中介
public class dyProxy implements InvocationHandler {
    private Host1 rent;

    public dyProxy() {
    }

    public void setHost(Host1 rent) {
        this.rent = rent;
    }

    //生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent,args);
        fare();
        return result;
    }
    //看房
    private void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    private void fare(){
        System.out.println("收中介费");
    }

}
