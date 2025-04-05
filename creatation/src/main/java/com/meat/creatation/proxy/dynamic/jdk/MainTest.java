package com.meat.creatation.proxy.dynamic.jdk;

/**
 * JDK动态代理
 * jdk要求被代理类对象必须要有接口
 *
 * 代理对象和目标对象的相同点在于都是同一个接口k
 */
public class MainTest {
    public static void main(String[] args) {
        TcTikTok tcTikTok = new TcTikTok();

        /**
         * 动态代理机制
         */
        ManTikTok proxy = JdkTiktokProxy.getProxy(tcTikTok);
        proxy.tiktok();
    }
}
