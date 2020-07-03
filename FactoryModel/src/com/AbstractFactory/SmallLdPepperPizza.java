package com.AbstractFactory;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 12:35
 **/

public class SmallLdPepperPizza  extends LDPepperPizza{
    @Override
    public void prepare() {
        System.out.println("SmallLdPepperPizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("SmallLdPepperPizza.bake");
    }

    @Override
    public void cut() {
        System.out.println("SmallLdPepperPizza.cut");
    }
}
