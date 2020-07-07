package com.cgjibModel;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-07 12:19
 **/

public class ProxyFactory implements MethodInterceptor {
    //维护一个目标对象
    private Object target;
//构造器传入一个被代理对象
    public ProxyFactory(Object target) {
        this.target = target;
    }
    //返回一个代理对象 target的代理对象
    public Object getProxyInstance(){
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象 即代理对象
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式 开始");
        Object invoke = method.invoke(target, objects);
        System.out.println("代理模式 提交");
        return invoke;
    }
}
