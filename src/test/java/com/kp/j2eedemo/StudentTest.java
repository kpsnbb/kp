package com.kp.j2eedemo;

import com.kp.j2eedemo.bll.impl.iStudentImpl;
import com.kp.j2eedemo.dao.IStudent;
import com.kp.j2eedemo.entity.AbsSuperObject;
import com.kp.j2eedemo.entity.KesunReturn;
import com.kp.j2eedemo.entity.Student;
import com.kp.j2eedemo.entity.StudentClass;
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
     * author:kp
     */
    @Test
    void testFindStuById() {
        stu.setId("kp333333");
        bll.setModel(stu);
        KesunReturn back = bll.findStuById();
        System.out.println(back.getMessage());
    }

/**
 * description:测试按照条件查找学生数据
 * date: 2022/4/1 19:55
 * author:kp
*/
    @Test
    void testFindStu() {
        Map<String, Object> cons = new HashMap<String, Object>();
        cons.put("name", "小雨");
        KesunReturn back = bll.findStus(cons);
        System.out.println(back.getMessage());
    }

/**
 * description:测试添加学生
 * date: 2022/4/1 22:41
 * author:kp
*/
    @Test
    void testAddStu() {
        stu.setId("kp123456");
        stu.setName("小王");
        stu.setMySex("男");
        stu.setSno("123456");
        stu.setMyClass(new StudentClass());
        stu.getMyClass().setId("1");
        bll.setModel(stu);
        KesunReturn back = bll.addStu();
        System.out.println(back.getCode() + ":" + back.getMessage());
    }

    /**
     * description:测试修改学生信息
     * date: 2022/4/1 22:16
     * author:kp
     */
    @Test
    void testEditStu() {
        stu.setId("kp123456");
        stu.setName("弟弟");
        bll.setModel(stu);
        KesunReturn back = bll.editStu();
        System.out.println(back.getMessage());
    }

/**
 * description:测试删除学生
 * date: 2022/4/1 21:52
 * author:kp
*/
    @Test
    void testBatchDelStu() {
        stu.setName("弟弟");
        stu.setId("kp123456");
        bll.setModel(stu);
        KesunReturn back=bll.delete();
        System.out.println(back.getMessage());
    }
    /**
     * description:测试批量新增学生
     * date: 2022/4/1 20:27
     * author:kp
    */
    @Test
    void testBatchSaveStus(){
        ArrayList<AbsSuperObject> objs = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            Student stu = new Student();
            stu.setName("康朋"+i);
            stu.setId("kp"+i);
            stu.setSno("36"+i);
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
     * author:kp
    */
    @Test
    void testbatchUpdat(){
        Student student = new Student();
        student.setId("kp99");
        student.setMyAge(100);
        Student student2 = new Student();
        student2.setId("kp94");
        student2.setMyAge(12);
        List<AbsSuperObject> stus = new ArrayList<>();
        stus.add(student);
        stus.add(student2);
        KesunReturn back = bll.batchUpdat(stus);
        System.out.println(back.getMessage());
    }
    @Test
    void testFindByPage() {
        Map<String, Object> cons = new HashMap<String, Object>();
        cons.put("name", "康朋");
        KesunReturn back = bll.findByPage(cons,1,10);
        System.out.println(back.getMessage());
    }
    @Test
    void tesFindme(){
        Student ceshi10 = dao.findMe("kp10");
        System.out.println(ceshi10);
    }
}