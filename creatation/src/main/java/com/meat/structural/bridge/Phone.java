package com.meat.structural.bridge;

public class Phone extends AbstractPhone{

    @Override
    String getPhone() {
        return "IPhone：" + sale.getSaleInfo();
    }
}
