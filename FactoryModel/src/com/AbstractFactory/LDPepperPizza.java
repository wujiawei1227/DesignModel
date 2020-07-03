package com.AbstractFactory;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-03 11:47
 **/

public abstract class LDPepperPizza extends Pizza {
    public abstract void prepare();
    public  abstract void bake();
    public abstract void cut();
  /*  @Override
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
    }*/
}
