package com.Singleton;

/**
 * @program: DesignModel
 * @description: 懒汉式 线程安全 同步方法 解决了线程安全问题
 * 但是效率太低 ，每个线程想获得类的实例时，执行getInstance()方法都要进行同步 而这个方法只执行一次实例化代码就够了，后面想获得该类实例，直接return就行
 * 方法进行同步效率太低
 *
 *
 * Java中static关键字可以作用在成员变量和成员函数上可以是看作是一种所属关系的声明，即被static修饰的成员变量和成员方法是属于类的，而不属于类的实例化对象。
 * 从内存分配上来看，被static修饰的成员变量在类成功加载后就已经为其分配内存，也就可以对其进行访问，
 * 当创建类的对象时，不再为其分配格外的内存，而是各个对象实例共享一个内存。
 * @author: wudaren
 * @create: 2020-07-02 22:27
 **/

public class Singleton04 {
    private  static Singleton04 instance;

    /*
    *
     *  当 synchronized 作用于静态方法时，其锁就是当前类的 class 对象锁。
     * 由于静态成员不专属于任何一个实例对象，是类成员，因此通过 class 对象锁可以控制静态成员的并发操作。
     * 需要注意的是如果一个线程 A 调用一个实例对象的非 static synchronized 方法，而线程 B 需要调用这个实例对象所属类的静态 synchronized 方法，
     * 是允许的，不会发生互斥现象，因为访问静态 synchronized 方法占用的锁是当前类的 class 对象，而访问非静态 synchronized 方法占用的锁是当前实例对象锁
     * ，二者的锁并不一样，所以不冲突。
     **/
    public static synchronized Singleton04 getInstance() {
        if (instance==null)
        {
            instance=new Singleton04();
        }
        return instance;
    }
}
