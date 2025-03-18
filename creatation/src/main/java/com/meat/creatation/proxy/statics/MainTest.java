package com.meat.creatation.proxy.statics;

/**
 * 核心：在不改变原来的接口的情况下扩展新功能，或者增强方法
 */
public class MainTest {
    public static void main(String[] args) {
        TikTokProxy proxy = new TikTokProxy();
        proxy.tiktok();
    }
}
