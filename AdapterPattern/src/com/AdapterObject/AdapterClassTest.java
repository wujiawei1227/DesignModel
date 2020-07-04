package com.AdapterObject;

/**
 * @program: DesignModel
 * @description:对象适配器
 * 根据接口服复用原则 使用组合代替继承 所以 解决了类适配器必须继承Voltage220V的局限性，也不再要求Voltage5V为接口
 * 使用成本更低 更灵活
 * @author: wudaren
 * @create: 2020-07-03 21:11
 **/

public class AdapterClassTest {
    public static void main(String[] args) {
       /* Phone phone=new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));*/
       Phone phone=new Phone();
       phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
