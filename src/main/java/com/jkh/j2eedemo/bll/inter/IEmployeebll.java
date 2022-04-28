package com.jkh.j2eedemo.bll.inter;

import com.jkh.j2eedemo.entity.Employee;

import java.util.List;
import java.util.Map;

public interface IEmployeebll {
    //定义新增员工方法
    int addEmployee(Employee employee);
    //定义单个员工查找方法
    Employee getEmployee(String id);
    //定义多个员工查找方法
    List<Map<String,Object>> findEmp(Map<String,Object> empmap);
//    定义修改员工修改数据方法
    int edit();
//    定义按条件修改员工方法
    int batchEdit(Map<String,Object> empbatchmap);
//    定义员工按条件删除
    int batchDel(Map<String,Object>empdelmap);
    //   批量添加员工
    int batchSave(List<Employee> emps);

}
