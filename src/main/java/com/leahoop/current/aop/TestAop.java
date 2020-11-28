package com.leahoop.current.aop;

import java.lang.reflect.Proxy;

public class TestAop {
    public static void main(String[] args) {
        JdkClass jdkClass = new JdkClass();
        MyInvocationHandler handler = new MyInvocationHandler(jdkClass);
        //这里的proxyInstance就是我们目标类的增强代理类
        JdkInterface proxyInstance = (JdkInterface) Proxy.newProxyInstance(jdkClass.getClass().getClassLoader(),
                jdkClass.getClass().getInterfaces(), handler);
        proxyInstance.add();
        //打印增强过的类类型
        System.out.println("=============" + proxyInstance.getClass());
    }

}
