package com.Singleton;

/**
 * @program: DesignModel
 * @description: 懒汉式 线程不安全
 * 起到了延迟加载的作用，但是只能在单线程下使用
 * 如果在多线程下，当一个线程进入 if (instance==null)判断语句块，还未来得及向下执行，另一个线程也通过了这个判断语句，这会产生多个实例
 * 在实际开发中不能使用这种方式
 * @author: wudaren
 * @create: 2020-07-02 22:20
 **/

public class Singleton03 {
    private static Singleton03 instance;
    private Singleton03(){}
    //提供一个静态的共有方法，当使用到该方法时，才去创建instance

    public static Singleton03 getInstance() {
        if (instance==null){
            instance=new Singleton03();
        }
            return instance;
    }
}
