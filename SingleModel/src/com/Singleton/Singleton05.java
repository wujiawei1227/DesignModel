package com.Singleton;

/**
 * @program: DesignModel
 * @description: 懒汉式 线程安全 延迟加载 同步效率高
 * 实例化代码只执行一次，后面再次访问时 判断if (instance==null) 直接return实例化对象，也避免了反复进行方法同步
 * @author: wudaren
 * @create: 2020-07-02 22:53
 **/

public class Singleton05 {
    //volatile变量的更新操作通知到其他线程，保证了新值能立即同步到主内存，以及"每次使用前"立即从主内存刷新
    private static volatile Singleton05 instance;
    private Singleton05(){}
    //提供一个静态的共有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载，同时保证效率
    public static synchronized Singleton05 getInstance(){
        if (instance==null){
            //此处只允许一个线程进入
            synchronized (Singleton05.class){
                if (instance==null){
                    instance=new Singleton05();
                }
            }
        }
        return instance;
    }
}
