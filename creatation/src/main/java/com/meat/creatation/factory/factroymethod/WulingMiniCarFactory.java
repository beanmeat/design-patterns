package com.meat.creatation.factory.factroymethod;

public class WulingMiniCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
