package com.AdapterInterface;

/**
 * @program: DesignModel
 * @description:接口适配器 适用于一个接口不想使用其所有方法的情况
 * 当不需要全部实现接口提供的方法时 可以先设计一个抽象类实现接口，并为该接口中每一个方法提供一个默认实现（空方法）
    那么该抽象类的子类可有选择的覆盖父类的某些方法来实现需求

 * @author: wudaren
 * @create: 2020-07-03 22:19
 **/

public class AdapterInterfaceTest {
    public static void main(String[] args) {
        AbsAdapter absAdapter=new AbsAdapter(){
            //只需要去覆盖我们需要使用的接口方法
            public void m1(){
                System.out.println("使用了m1方法");
            }
        };
       absAdapter.m1();
    }
}
