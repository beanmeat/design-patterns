package com.meat.creatation.decorator;

/**
 * 美颜装饰器
 * 装饰器只关心增强这个类的方法
 * 适配器是调用外部接口
 */
public class MeiYanDecorator implements TiktokDecorator{

    private ManTikTok manTikTok;

//    private Framwork framwork; 适配器，连接了两个东西

    public MeiYanDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        this.enable();

//        framwork.enable();
        manTikTok.tiktok();
    }

    /**
     * 定义增强的功能
     */
    public void enable() {
        System.out.println("enable.......");
    }
}
