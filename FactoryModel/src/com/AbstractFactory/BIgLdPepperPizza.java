package com.AbstractFactory;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 12:33
 **/

public class BIgLdPepperPizza extends LDPepperPizza {
    @Override
    public void prepare() {
        System.out.println("BIgLdPepperPizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("BIgLdPepperPizza.bake");
    }

    @Override
    public void cut() {
        System.out.println("BIgLdPepperPizza.cut");
    }
}
