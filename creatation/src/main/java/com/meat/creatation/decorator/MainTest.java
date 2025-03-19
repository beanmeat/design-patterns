package com.meat.creatation.decorator;

/**
 * 装饰器是增强一个类
 * 向一个现有的对象添加新的功能，同时又不改变其结构，属于对象结构型模式。
 * 创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供额外的功能
 */
public class MainTest {
    public static void main(String[] args) {
        TchTikTok tikTok = new TchTikTok();
        MeiYanDecorator decorator = new MeiYanDecorator(tikTok);
        decorator.tiktok();
    }
}
