package com.jkh.j2eedemo.dao;

import com.jkh.j2eedemo.entity.Employee;
import com.jkh.j2eedemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IEmployee {
    //定义新增员工方法
    int addEmployee(Employee employee);
    //定义单个员工查找方法
    Employee getEmployee(String id);
    //定义多个员工查找方法
    List<Map<String,Object>> findEmp(Map<String,Object> empmap);
    //定义员工修改数据方法
    int edit(Employee employee);
    //按条件查询员工数据
    int batchEdit(Map<String,Object> empeditmap);
    //定义删除员工按条件删除操作
    int batchDel(Map<String,Object> delmap);
   //利用foreach实现员工批量新增
    int batchSave(List<Employee> emps);
}
