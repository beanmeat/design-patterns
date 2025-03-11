package com.meat.creatation.factory.factroymethod;

public class MainTest {
    public static void main(String[] args) {
        AbstractCarFactory factory = new WulingRacingCarFactory();
        AbstractCar car = factory.newCar();
        car.run();
    }
}
