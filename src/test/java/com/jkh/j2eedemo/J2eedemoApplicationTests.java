package com.jkh.j2eedemo;

import com.jkh.j2eedemo.bll.impl.IEmpolyeebllimpl;
import com.jkh.j2eedemo.entity.Employee;
import com.jkh.j2eedemo.entity.KesunReturn;
import com.jkh.j2eedemo.entity.Student;
import com.jkh.j2eedemo.bll.impl.iStudentImpl;
import com.jkh.j2eedemo.entity.StudentClass;
import com.jkh.j2eedemo.util.dateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class J2eedemoApplicationTests {
    @Autowired
    private Student stu;
    @Autowired
    private iStudentImpl bll;
    @Autowired
    private StudentClass stuclass;
    @Test
    void contextLoads() {
    }
    @Test
    void testStudent(){
       stu.setSno("200628120325");
       stu.setName("吉康辉");
       stu.setMyClass(new StudentClass());
       stu.getMyClass().setName("j2ee2");
       stu.setMyAge(20);
       stu.setMySex("男");
//       istu.disPlay();
    }
    @Test
    void testmybitis(){
        stu.setId("04");
        bll.setModel(stu);
        KesunReturn back = bll.findStuById();
        System.out.println(back.getMessage());
        if ("6666".equals(back.getCode())){
            Student obj = (Student)back.getObj();
            System.out.println(obj.getMyClass().getName());
        }
    }
    @Test
    void testFind(){
        Map<String,Object> cons=new HashMap<String,Object>();
        cons.put("name","小");
        bll.findStus(cons);

    }
    @Test
    void testAdd(){
        stu.setId("6696835354594884");
        stu.setName("爱意随风起");
        stu.setMySex("女");
        stu.setSno("66666666");
        stu.setMyClass(new StudentClass());
        stu.getMyClass().setId("1");
        bll.setModel(stu);
        KesunReturn back = bll.addStu();
        System.out.println(back.getCode()+":"+back.getMessage());
    }







    @Autowired
    private IEmpolyeebllimpl empimpl;
    @Autowired
    private Employee emp;
    @Test
    void testaddEmployee(){//测试新增员工方法
        emp.setId("22226");
        emp.setName("李五");
        emp.setSex('男');
        emp.setBirthday(dateUtil.GetDate("2001-8-7"));
        int i = empimpl.addEmployee(emp);
        if(i>0){
            System.out.println("员工信息添加成功"+i+"条数据添加成功");
        }
    }
    @Test
    void testGetEmployee(){//测试单个员工查找方法
        Employee employee = empimpl.getEmployee("3");
        DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
        System.out.println("查询到的员工姓名为"+employee.getName()+"  性别为"+employee.getSex()
        +"   生日为"+dateUtil.getStringDate(employee.getBirthday(),dateUtil.LONGDATETYPE)+"   职位为"+employee.getPosition()
        );
    }
    @Test
    void testFindEmp(){//测试多个员工查找方法模糊查询 //动态查询choose
        Map<String,Object> empmap=new HashMap<String,Object>();
        empmap.put("number","2121");
        List<Map<String, Object>> emp = empimpl.findEmp(empmap);
        for (Map i:emp){
            System.out.println(i);
        }
    }
}
