package com.meat.creatation.factory.factroymethod;

public class RacingCar extends AbstractCar {
    public RacingCar() {
        this.engine = "V8发动机";
    }

    @Override
    public void run() {
        System.out.println(engine + "---> 嗖...");
    }
}
