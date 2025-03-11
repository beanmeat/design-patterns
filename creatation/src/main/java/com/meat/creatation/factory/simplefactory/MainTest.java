package com.meat.creatation.factory.simplefactory;

public class MainTest {
    public static void main(String[] args) {
        WulingSimpleFactory factory = new WulingSimpleFactory();
        AbstractCar car = factory.newCar("mini");
        car.run();
    }
}
