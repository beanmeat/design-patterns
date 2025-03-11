package com.meat.creatation.factory.abstractFactory;

public class WulingRacingCarFactory extends WulingFactory{
    @Override
    AbstractMask newMask() {
        return null;
    }

    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }
}
