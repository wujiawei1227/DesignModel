package com.staticproxy;

/**
 * @program: DesignModel
 * @description:静态代理 代理类在程序运行前就编译好，称为静态代理
 * 代理对象TeacherDaoProxy和被代理对象TeacherDao实现先相同相同的接口或者继承相同的父类
 * 一旦接口或者父类添加、修改方法，子类都要同意更改，违背开闭原则。因此有一定的局限性
 * @author: wudaren
 * @create: 2020-07-06 22:24
 **/

public class client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao=new TeacherDao();
        //创建代理对象，同时将被代理的对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy=new TeacherDaoProxy(teacherDao);
        //通过代理对象 调用到被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调目标对象的方法
        teacherDaoProxy.teach();
    }
}
