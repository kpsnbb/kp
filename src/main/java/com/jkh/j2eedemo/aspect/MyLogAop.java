package com.jkh.j2eedemo.aspect;

import com.alibaba.fastjson.JSON;
import com.jkh.j2eedemo.bll.impl.Log.DoLogServiceimpl;
import com.jkh.j2eedemo.entity.KesunReturn;
import com.jkh.j2eedemo.entity.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class MyLogAop {
    @Autowired
    private DoLogServiceimpl dologservice;
    private Date startdate;
    @Pointcut(value="execution(* com.jkh.j2eedemo.bll.impl.*.*(..))")
    public void mypointcut(){

    }
    @Before("mypointcut()")
    public void domybeforeaop(){
         System.out.println("前置通知>>>");
         startdate = new Date();
    }
    @AfterReturning(value = "mypointcut()",returning = "back")
    public void domyafteraop(JoinPoint joinPoint, KesunReturn back){
        Log log = new Log();
        Date finishtime = new Date();
        log.setFinishDate(finishtime);
        log.setActionName(joinPoint.getSignature().getName());
        System.out.println("AfterReturning,返回值通知>>>");
        log.setModuleName(joinPoint.getTarget().getClass().getSimpleName());
        log.setParams(JSON.toJSONString(joinPoint.getArgs()));
        log.setReturnValue(JSON.toJSONString(back));
        log.setName(joinPoint.getSignature().getName());
        log.setBussinessDate(startdate);
        log.setStatus(back.getCode());
        log.setDescription(joinPoint.getSignature().toString());
        dologservice.addLog(log);
        System.out.println(log);
    }
}
