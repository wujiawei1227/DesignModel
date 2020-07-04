package com.AdapterClass;

/**
 * @program: DesignModel
 * @description:类适配器
 * java是单继承机制 适配器VoltageAdapter继承Voltage220V类就只能将Voltage5V定义为接口，有一定的局限性
 * Voltage220V类的output220V()方法会在适配器VoltageAdapter中暴露出来，增加了使用成本
 * 适配器VoltageAdapter继承Voltage220V类，可以根据需求重写方法 是的适配器VoltageAdapter的灵活性增强
 * @author: wudaren
 * @create: 2020-07-03 21:11
 **/

public class AdapterClassTest {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.charging(new VoltageAdapter());
    }
}
