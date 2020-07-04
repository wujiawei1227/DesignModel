package com.AbstractFactory;

/**
 * @program: DesignModel
 * @description:
 * 降低耦合
 * 更符合开闭原则：新增一种产品类时，只需要增加相应的具体产品类和相应的工厂子类即可
 * 符合单一职责原则：每个具体工厂类只负责创建对应的产品
 *
 * 抽象工厂模式很难支持新种类产品的变化。
 * 这是因为抽象工厂接口中已经确定了可以被创建的产品集合，如果需要添加新产品，此时就必须去修改抽象工厂的接口，这样就涉及到抽象工厂类的以及所有子类的改变，这样也就违背了“开发——封闭”原则。
 *
 * @author: wudaren
 * @create: 2020-07-03 12:00
 **/

public class PizzaFactoryTest {
    public static void main(String[] args) {
        LDPepperPizzaFactory factory=new LDPepperPizzaFactory();
        factory.getBigPizza().cut();
    }
}
