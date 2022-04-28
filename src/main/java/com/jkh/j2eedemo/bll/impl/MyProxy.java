package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.dao.IDoData;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {

    private IDoData dao;
    public Object createProxy(IDoData dao){
    this.dao=dao;
        ClassLoader classLoader = MyProxy.class.getClassLoader();
        Class[] interfaces = this.dao.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.log();
        Object invoke = method.invoke(dao, args);
         myAspect.loglog(invoke,method.getName(),args);
        return invoke;
    }
}
