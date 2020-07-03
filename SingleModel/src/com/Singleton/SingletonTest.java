package com.Singleton;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2060-07-06 22:06
 **/

public class SingletonTest {
    public static void main(String[] args) {
        Singleton06 singleton1= Singleton06.getInstance();
        Singleton06 singleton2= Singleton06.getInstance();

        System.out.println(singleton1.equals(singleton2));
        System.out.println("singleton1.hashCode:"+singleton1.hashCode());
        System.out.println("singleton2.hashCode:"+singleton2.hashCode());
    }
}
