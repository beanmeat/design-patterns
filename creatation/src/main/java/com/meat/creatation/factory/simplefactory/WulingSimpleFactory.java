package com.meat.creatation.factory.simplefactory;

/**
 * 简单工厂
 * 产品数量极少
 */
public class WulingSimpleFactory {

    public AbstractCar newCar(String type){
        if("van".equals(type)){
            return new VanCar();
        }else if("mini".equals(type)){
            return new MiniCar();
        }
        return null;
    }
}
