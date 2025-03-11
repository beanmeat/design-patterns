package com.meat.creatation.factory.abstractFactory;

public class CommonMask extends AbstractMask{

    public CommonMask() {
        this.price = 1;
    }

    @Override
    public void protectMe() {
        System.out.println("普通口罩...简单保护...");
    }
}
