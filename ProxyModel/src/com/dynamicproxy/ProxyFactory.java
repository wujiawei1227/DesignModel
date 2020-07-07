package com.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: DesignModel
 * @description:
 * @author: wudaren
 * @create: 2020-07-06 22:44
 **/

public class ProxyFactory {
    //维护一个目标对象 object
    private Object terget;

    public ProxyFactory(Object terget) {
        this.terget = terget;
    }
    //给目标对象生成一个代理对象

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(terget.getClass().getClassLoader(), terget.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始");
                //反射机制调用目标对象方法
                Object retirnVal=method.invoke(terget,args);
                System.out.println("JDK代理提交");
                return retirnVal;
            }
        });
    }
}
