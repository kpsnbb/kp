package com.kp.j2eedemo.bll.impl;


import com.kp.j2eedemo.bll.inter.AbsSuperServiceInter;
import com.kp.j2eedemo.bll.inter.iStudentInter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MybllProxy implements InvocationHandler {

    private AbsSuperServiceInter bll;
    public Object createProxy(iStudentInter bll){
        this.bll=bll;
        ClassLoader classLoader = MyProxy.class.getClassLoader();
        Class[] interfaces = this.bll.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.log();
        Object invoke = method.invoke(bll, args);
        myAspect.loglog(invoke,method.getName(),args);
        return invoke;
    }
}
