package com.kp.j2eedemo;

import com.kp.j2eedemo.bll.inter.IEmployeebll;
import com.kp.j2eedemo.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class Emptest {
    @Autowired
    private Employee employee;
    @Autowired
    private IEmployeebll bll;
    //?????????????
    @Test
    void testEdit(){
        employee.setId("6");
        employee.setName("xx");
        employee.setSex('男');
        System.out.println( bll.edit());
    }
    //???????????
    @Test
    void testBatchEdit(){
        Map<String,Object> embatchmap=new HashMap<String,Object>();
        embatchmap.put("name","xxx");
        embatchmap.put("position","???");
        bll.batchEdit(embatchmap);
    }
    //???????????
    @Test
    void testBatchDel(){
        Map<String,Object> empdelmap=new HashMap<String,Object>();
        empdelmap.put("name","xx");
        bll.batchDel(empdelmap);
    }
    //????????????
    @Test
    void testbatchSave(){
        List<Employee> emps=new ArrayList<Employee>();
        for (int i = 88; i <111 ; i++) {
            Employee e =new Employee();
            e.setId("01"+i);
            e.setSex('男');
            e.setName("xx");
            emps.add(e);
        }
        bll.batchSave(emps);

    }
}
