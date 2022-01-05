package com.yy.proxy;

/**
 * @author shkstart
 * @create 2021-12-30 19:19
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房
        Host host = new Host();
        //中介帮助房东
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
