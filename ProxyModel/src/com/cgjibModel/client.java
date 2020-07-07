package com.cgjibModel;

/**
 * @program: DesignModel
 * @description:
 * 弥补了动态代理的不足，采用非常底层的字节码技术
 * 通过字节码技术为一个类创建子类，并在子类中才用方法拦截的技术拦截所有父类方法的调用，顺势植入横切逻辑
 * 来完成动态代理的实现
 * 对于final方法无法进行代理
 * @author: wudaren
 * @create: 2020-07-07 12:27
 **/

public class client {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //获取到代理对象 ，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(teacherDao).getProxyInstance();
        //执行代理对象方法 触发intectpt方法
        String teach = proxyInstance.teach();
        System.out.println(teach);
    }
}
