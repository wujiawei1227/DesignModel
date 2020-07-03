package com.AbstractFactory;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 12:34
 **/

public class SmallBjChessPizza extends BjchessPizza {
    @Override
    public void prepare() {
        System.out.println("SmallBjChessPizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("SmallBjChessPizza.bake");
    }

    @Override
    public void cut() {
        System.out.println("SmallBjChessPizza.cut");
    }
}
