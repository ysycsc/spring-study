package com.yy.dyProxy;

import com.yy.proxy.Host;

/**
 * @author shkstart
 * @create 2021-12-30 19:19
 */
public class Client1 {
    public static void main(String[] args) {
        //房东要租房
        Host1 host =  new Host1();
        //中介帮助房东
        dyProxy dyProxy = new dyProxy();
        dyProxy.setHost(host);
        Rent1 proxy = (Rent1)dyProxy.getProxy();
        proxy.rent();
    }
}
