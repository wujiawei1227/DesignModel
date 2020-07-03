package com.Singleton;

/**
 * @program: DesignModel
 * @description: 静态内部类 实现延迟加载 效率高 但是外部无法传递参数进去
 * 静态内部类在类加载时不会被立即初始化 而是在需要实例化，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton实例化
 * 类的静态属性只会在第一次加载类时初始化，所以，此处jvm帮助我们保证线程的安全性，在类进行初始化时，别的类是无法进入的
 * @author: wudaren
 * @create: 2020-07-03 09:36
 **/

public class Singleton06 {
    private static volatile  Singleton06 instance;
    //构造器私有化
    private Singleton06(){}
    //写一个静态内部类，他有一个静态属性
    private static class SingletonInstance{
        private static final Singleton06 INSTANCE =new Singleton06();
    }

    public static Singleton06 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
