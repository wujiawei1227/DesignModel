package com.FactoryMethod;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 12:17
 **/

public class LDPepperPizzaFactory extends PizzaFactory {
    @Override
    public LDPepperPizza getPizza() {
        return new LDPepperPizza();
    }
}
