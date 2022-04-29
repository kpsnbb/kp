package com.kp.j2eedemo;

import com.kp.j2eedemo.bll.impl.IStuClassServiceImpl;
import com.kp.j2eedemo.dao.IBanJi;
import com.kp.j2eedemo.dao.IStudentClass;
import com.kp.j2eedemo.entity.AbsSuperObject;
import com.kp.j2eedemo.entity.KesunReturn;
import com.kp.j2eedemo.entity.StudentClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class StudentClassTest {
    @Autowired
    private IStudentClass dao;
    @Autowired
    private IStuClassServiceImpl bll;
    @Autowired
    private IBanJi banJidao;
    @Test
    void testFindClass(){
        AbsSuperObject cla = dao.findById("2");
        System.out.println(cla);
    }
    /**
     * description:测试查询班级里的所有学生
     * date: 2022/4/1 19:54
     * author:kp
    */
    @Test
    void testfindStus(){
        StudentClass studentClass = new StudentClass();
        studentClass.setId("2");
        bll.setModel(studentClass);
        KesunReturn back = bll.findStus();
        System.out.println(back.getMessage());
    }
    @Test
    void testBanJiSelect(){
        Map<String, Object> cons = new HashMap<>();
        cons.put("charger",1);
        banJidao.findStudentClass(cons);
    }

}
