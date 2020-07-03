package com.AbstractFactory;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 12:16
 **/

public class BjchessPizzaFactory extends PizzaFactory {
    @Override
    public BigBjchessPizza getBigPizza() {
        return new BigBjchessPizza();
    }

    @Override
    public Pizza getSmallPizza() {
        return new SmallBjChessPizza();
    }
}
