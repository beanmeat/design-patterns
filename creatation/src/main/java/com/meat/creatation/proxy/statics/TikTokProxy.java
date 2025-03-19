package com.meat.creatation.proxy.statics;

/**
 * 代理一般都和被代理对象属于一个接口
 */
public class TikTokProxy implements ManTikTok{

    private ManTikTok manTikTok;

    public TikTokProxy(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        System.out.println("前置增强...");
        manTikTok.tiktok();
        System.out.println("后置增强...");
    }
}
