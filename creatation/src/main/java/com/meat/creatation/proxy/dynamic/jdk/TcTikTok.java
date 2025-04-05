package com.meat.creatation.proxy.dynamic.jdk;

public class TcTikTok implements ManTikTok ,SellTikTok{
    @Override
    public void tiktok() {
        System.out.println("TCH,tiktok...");
    }

    @Override
    public void sell() {
        System.out.println("sell....");
    }
}
