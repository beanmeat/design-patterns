package com.meat.structural.bridge;

/**
 * 省去了很多类的创建
 */
public class MainTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setSale(new OfflineSale("a",100));
        String ret = phone.getPhone();
        System.out.println(ret);
    }
}
