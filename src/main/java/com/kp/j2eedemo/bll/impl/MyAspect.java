package com.kp.j2eedemo.bll.impl;

public class MyAspect {
    public void log(){
        System.out.println("运行了代理方法！");
    }
    public void loglog(Object res,String method,Object params){
        System.out.println("功能名称"+method+"执行结果"+res+"传入参数"+params);
    }
}
