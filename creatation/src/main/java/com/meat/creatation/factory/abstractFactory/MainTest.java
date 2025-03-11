package com.meat.creatation.factory.abstractFactory;


public class MainTest {
    public static void main(String[] args) {
        WulingFactory factory = new WulingRacingCarFactory();
        AbstractCar car = factory.newCar();
        car.run();

        WulingFactory factory1 = new WulingVanCarFactory();
        AbstractCar car1 = factory1.newCar();
        car1.run();
    }
}
