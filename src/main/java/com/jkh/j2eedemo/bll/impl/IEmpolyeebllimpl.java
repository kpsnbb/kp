package com.jkh.j2eedemo.bll.impl;

import com.jkh.j2eedemo.bll.inter.IEmployeebll;
import com.jkh.j2eedemo.dao.IEmployee;
import com.jkh.j2eedemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class IEmpolyeebllimpl implements IEmployeebll {
    @Autowired
    private Employee emp;
    @Autowired
    private IEmployee dao;

    @Override//业务层实现员工新增
    public int addEmployee(Employee employee) {
        return dao.addEmployee(employee);
    }

    @Override//业务层实现单个员工查询
    public Employee getEmployee(String id) {
        return dao.getEmployee(id);
    }

    @Override//业务层实现多个员工查询choose
    public List<Map<String, Object>> findEmp(Map<String, Object> empmap) {
        return dao.findEmp(empmap);
    }

    @Override
    public int edit() {
        if (dao == null || emp == null) {
            return 0;
        }
        return dao.edit(emp);
    }

    @Override
    public int batchEdit(Map<String, Object> empbatchmap) {
        if (dao == null || empbatchmap == null
                ||empbatchmap.get("name")==null||empbatchmap.get("position")==null) {
            return 0;
        }
        return dao.batchEdit(empbatchmap);
    }

    @Override
    public int batchDel(Map<String, Object> empdelmap) {

        if (empdelmap.get("name")==null||dao==null){return 0;}
        return dao.batchDel(empdelmap);
    }

    @Override
    public int batchSave(List<Employee> emps) {

      if (emps.size()==0||dao==null) return 0;
      return dao.batchSave(emps);
    }
}
