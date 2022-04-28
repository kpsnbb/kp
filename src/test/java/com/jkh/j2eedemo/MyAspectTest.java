package com.jkh.j2eedemo;

import com.jkh.j2eedemo.bll.impl.AbsSuperService;
import com.jkh.j2eedemo.bll.impl.MyProxy;
import com.jkh.j2eedemo.bll.impl.MybllProxy;
import com.jkh.j2eedemo.bll.impl.iStudentImpl;
import com.jkh.j2eedemo.bll.inter.AbsSuperServiceInter;
import com.jkh.j2eedemo.bll.inter.iStudentInter;
import com.jkh.j2eedemo.dao.IStudent;
import com.jkh.j2eedemo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class MyAspectTest {
    @Autowired
    private IStudent studao;
    @Autowired
    private iStudentInter stuinter;

//    @Test
//    void testaspect() {
//        // 测试IDodata代理
//        MyProxy myProxy = new MyProxy();
//        IStudent istudao = (IStudent) myProxy.createProxy(studao);
//        istudao.findMe("ceshi0");
//        Map<String, Object> stringObjectHashMap = new HashMap<>();
//        stringObjectHashMap.put("name", "16");
//        stringObjectHashMap.put("sno", "236");
//        istudao.find(stringObjectHashMap);
//        //测试业务类的代理
//        MybllProxy mybllProxy = new MybllProxy();
//        iStudentInter bllobj = (iStudentInter) mybllProxy.createProxy(stuinter);
//        Student student = new Student();
//        student.setId("ceshi01");
//
//        bllobj.setModel(student);
//        bllobj.findStuById();
//    }

    @Test
    void testaspect2() {

    }
}
