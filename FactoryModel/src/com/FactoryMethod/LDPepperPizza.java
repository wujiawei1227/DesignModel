package com.FactoryMethod;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 11:47
 **/

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("LDPepperPizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("LDPepperPizza.bake");
    }

    @Override
    public void cut() {
        System.out.println("LDPepperPizza.cut");
    }
}
