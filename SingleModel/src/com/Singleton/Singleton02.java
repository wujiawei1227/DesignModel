package com.Singleton;

/**
 * @program: DesignModel
 * @description: 饿汉式   静态代码块
 * * 在类装载时完成实例化 。避免线程同步问题
 *  * 如果自始至终未使用过这个类，则会造成内存浪费
 * @author: wudaren
 * @create: 2020-07-02 22:16
 **/

public class Singleton02 {
    //私有化构造器外部不能new
    private Singleton02(){}
    private static Singleton02 instance;
    static {
        instance=new Singleton02();
    }

    //提供一个共有的静态方法 返回实例对象

    public static Singleton02 getInstance() {
        return instance;
    }
}
