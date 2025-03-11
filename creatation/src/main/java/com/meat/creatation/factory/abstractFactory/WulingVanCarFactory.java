package com.meat.creatation.factory.abstractFactory;

public class WulingVanCarFactory extends WulingFactory{
    @Override
    AbstractMask newMask() {
        return null;
    }

    @Override
    AbstractCar newCar() {
        return new VanCar();
    }
}
