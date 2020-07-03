package com.FactoryMethod;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 11:45
 **/

public class BjchessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("BjchessPizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("BjchessPizza.bake");
    }

    @Override
    public void cut() {
        System.out.println("BjchessPizza.cut");
    }
}
