package com.SimpleModel;

/**
 * @program: DesignModel
 * @description:
 * 把创建实例的工作与使用实例的工作分开。使用者不必担心对象如何创建，实现了解耦
 * 把初始化实例时的工作放到工厂里进行，使代码更容易维护。更符合面向对象的原则 面向接口编程
 *
 * 违背开闭原则 一但添加新产品就不得不修改工厂类逻辑，造成工厂类逻辑过于复杂
 * @author: wudaren
 * @create: 2020-07-03 12:00
 **/

public class PizzaFactoryTest {
    public static void main(String[] args) {
        PizzaFactory factory=new PizzaFactory();
        Pizza bjchesspizza = factory.getPizza("bjchesspizza");
        bjchesspizza.cut();
    }
}
