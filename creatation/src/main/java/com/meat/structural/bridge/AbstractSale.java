package com.meat.structural.bridge;

/**
 * 抽象的销售渠道
 */
public class AbstractSale {

    private String type;
    private Integer price;

    public AbstractSale(String type, Integer price) {
        this.type = type;
        this.price = price;
    }

    String getSaleInfo(){
        return "渠道：" + type + "--- 价格：" + price;
    }
}
