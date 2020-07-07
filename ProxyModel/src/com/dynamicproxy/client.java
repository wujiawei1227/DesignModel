package com.dynamicproxy;

/**
 * @program: DesignModel
 * @description:
 * 弥补了静态代理需要子类继承或者实现父类的缺点，利用反射机制创建对象，进一步降低了耦合度。
 * 动态代理必须依赖接口的实现，
 * @author: wudaren
 * @create: 2020-07-06 22:50
 **/

public class client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacher teacher=new TeacherDao();
        //给目标对象创建代理对象，可以转成TeacherDao
        ITeacher proxyInstance = (ITeacher)new ProxyFactory(teacher).getProxyInstance();
        //通过代理对象，调用目标对象的方法
        proxyInstance.sayHello("tom");
    }
}
