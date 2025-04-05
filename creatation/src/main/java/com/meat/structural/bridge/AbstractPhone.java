package com.meat.structural.bridge;

public abstract class AbstractPhone {

    // 桥接对象..设计期间就得想好
    AbstractSale sale;

    /**
     * 当前手机的描述
     */
    abstract String getPhone();

    public void setSale(AbstractSale sale){
        this.sale = sale;
    }
}
