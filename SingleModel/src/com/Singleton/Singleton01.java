package com.Singleton;

/**
 * @program: DesignModel
 * @description: 饿汉模式 静态常量
 * 在类装载时完成实例化 。避免线程同步问题
 * 如果自始至终未使用过这个类，则会造成内存浪费
 * @author: wudaren
 * @create: 2020-07-02 22:01
 **/


public class Singleton01 {
    //私有化构造器 外部不能new
    private Singleton01(){}
    //本类内部创建对象实例
    private final static Singleton01 instance=new Singleton01();
    //提供共有静态方法，返回实例对象

    public static Singleton01 getInstance() {
        return instance;
    }
}
