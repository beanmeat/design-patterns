package com.meat.creatation.factory.factroymethod;

public class WulingRacingCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
