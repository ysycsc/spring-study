package com.yy.proxy;

/**
 * @author shkstart
 * @create 2021-12-30 19:13
 */
//代理角色 中介
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
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
