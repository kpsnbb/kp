package com.jkh.j2eedemo;

import com.jkh.j2eedemo.bll.impl.AbsSuperService;
import com.jkh.j2eedemo.bll.impl.iStudentImpl;
import com.jkh.j2eedemo.dao.IStudent;
import com.jkh.j2eedemo.entity.AbsSuperObject;
import com.jkh.j2eedemo.entity.KesunReturn;
import com.jkh.j2eedemo.entity.Student;
import com.jkh.j2eedemo.entity.StudentClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class StudentTest {
    @Autowired
    private Student stu;
    @Autowired
    private iStudentImpl bll;
    @Autowired
    private IStudent dao;

    /**
     * description:测试通过id查找学生
     * date: 2022/4/1 22:15
     * author:jkh
     */
    @Test
    void testFindStuById() {
        stu.setId("ceshi56");
        bll.setModel(stu);
        KesunReturn back = bll.findStuById();
        System.out.println(back.getMessage());
    }

/**
 * description:测试按照条件查找学生数据
 * date: 2022/4/1 19:55
 * author:jkh
*/
    @Test
    void testFindStu() {
        Map<String, Object> cons = new HashMap<String, Object>();
        cons.put("name", "测试");
        KesunReturn back = bll.findStus(cons);
        System.out.println(back.getMessage());
    }

/**
 * description:测试添加学生
 * date: 2022/4/1 22:41
 * author:jkh
*/
    @Test
    void testAddStu() {
        stu.setId("ceshi68787");
        stu.setName("小雨");
        stu.setMySex("女");
        stu.setSno("66666666");
        stu.setMyClass(new StudentClass());
        stu.getMyClass().setId("1");
        bll.setModel(stu);
        KesunReturn back = bll.addStu();
        System.out.println(back.getCode() + ":" + back.getMessage());
    }

    /**
     * description:测试修改学生信息
     * date: 2022/4/1 22:16
     * author:jkh
     */
    @Test
    void testEditStu() {
        stu.setId("ceshi666");
        stu.setName("小猫小猫");
        bll.setModel(stu);
        KesunReturn back = bll.editStu();
        System.out.println(back.getMessage());
    }

/**
 * description:测试删除学生
 * date: 2022/4/1 21:52
 * author:jkh
*/
    @Test
    void testBatchDelStu() {
        stu.setName("吉康辉");
        stu.setId("1");
        bll.setModel(stu);
        KesunReturn back=bll.delete();
        System.out.println(back.getMessage());
    }
    /**
     * description:测试批量新增学生
     * date: 2022/4/1 20:27
     * author:jkh
    */
    @Test
    void testBatchSaveStus(){
        ArrayList<AbsSuperObject> objs = new ArrayList<>();
        for (int i = 0; i <1000 ; i++) {
            Student stu = new Student();
            stu.setName("吉康辉"+i);
            stu.setId("ceshi"+i);
            stu.setSno("20325"+i);
            stu.setMyAge(20);
            stu.setMyClass(new StudentClass());
            stu.getMyClass().setId("1");
            stu.setMySex("男");
            stu.setNumber("25"+i);
            objs.add(stu);
        }
        KesunReturn back = bll.batchSaveStu(objs);
        System.out.println(back.getMessage());
    }
    /**
     * description:测试批量修改
     * date: 2022/4/1 22:23
     * author:jkh
    */
    @Test
    void testbatchUpdat(){
        Student student = new Student();
        student.setId("ceshi99");
        student.setMyAge(1000);
        Student student2 = new Student();
        student2.setId("ceshi98");
        student2.setMyAge(18);
        List<AbsSuperObject> stus = new ArrayList<>();
        stus.add(student);
        stus.add(student2);
        KesunReturn back = bll.batchUpdat(stus);
        System.out.println(back.getMessage());
    }
    @Test
    void testFindByPage() {
        Map<String, Object> cons = new HashMap<String, Object>();
        cons.put("name", "吉康辉");
        KesunReturn back = bll.findByPage(cons,1,10);
        System.out.println(back.getMessage());
    }
    @Test
    void tesFindme(){
        Student ceshi10 = dao.findMe("ceshi10");
        System.out.println(ceshi10);
    }
}