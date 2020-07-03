package com.FactoryMethod;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 12:16
 **/

public class BjchessPizzaFactory extends PizzaFactory {
    @Override
    public BjchessPizza getPizza() {
        return new BjchessPizza();
    }
}
