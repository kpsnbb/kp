package com.jkh.j2eedemo.bll.impl;


import com.jkh.j2eedemo.dao.IDoData;
import com.jkh.j2eedemo.dao.IStudent;
import com.jkh.j2eedemo.entity.KesunReturn;
import com.jkh.j2eedemo.bll.inter.iStudentInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class iStudentImpl extends AbsSuperService implements iStudentInter {
    @Autowired
    private IStudent dao;

    @Override
    public IDoData getDao() {
        return dao;
    }

    private KesunReturn checkDAO() {
        KesunReturn back = new KesunReturn();
        if (getDao() == null) {
            back.setCode("0000");
            back.setMessage("查询过程中数据访问层出错！");
            back.setObj(false);
        } else {
            back.setCode("0000");
            back.setMessage("查询过程中数据访问层出错！");
            back.setObj(true);
        }
        return back;
    }



}