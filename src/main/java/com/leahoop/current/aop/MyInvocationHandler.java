package com.leahoop.current.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before-------切面加入逻辑");
        Object invoke = method.invoke(target, args);//通过反射执行，目标类的方法
        System.out.println("after-------切面加入逻辑");
        return invoke;

    }
}
