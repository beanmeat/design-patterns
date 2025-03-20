package com.meat.creatation.proxy.statics;

/**
 * 代理的东西不一样，每一种不同的被代理类都要创建不同的静态代理类
 */
public class MainTest {
    public static void main(String[] args) {
        TikTokProxy proxy = new TikTokProxy(new TcTikTok());
        proxy.tiktok();

        // 静态代理就是装饰器，装饰器模式就是代理模式的一种
    }
}
