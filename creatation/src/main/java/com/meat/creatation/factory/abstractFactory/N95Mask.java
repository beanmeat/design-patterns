package com.meat.creatation.factory.abstractFactory;

public class N95Mask extends AbstractMask{
    public N95Mask() {
        this.price = 2;
    }

    @Override
    public void protectMe() {
        System.out.println("N95口罩....超级防护");
    }
}
