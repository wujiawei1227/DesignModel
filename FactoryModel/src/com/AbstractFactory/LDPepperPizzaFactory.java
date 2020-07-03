package com.AbstractFactory;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 12:17
 **/

public class LDPepperPizzaFactory extends PizzaFactory {

    @Override
    public Pizza getBigPizza() {
        return new BIgLdPepperPizza();
    }

    @Override
    public Pizza getSmallPizza() {
        return new SmallLdPepperPizza();
    }
}
