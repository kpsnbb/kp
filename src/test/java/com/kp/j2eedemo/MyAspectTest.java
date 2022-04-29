package com.kp.j2eedemo;

import com.kp.j2eedemo.bll.inter.iStudentInter;
import com.kp.j2eedemo.dao.IStudent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
