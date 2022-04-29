package com.kp.j2eedemo.bll.inter;

import com.kp.j2eedemo.dao.IDoData;
import com.kp.j2eedemo.entity.AbsSuperObject;
import com.kp.j2eedemo.entity.KesunReturn;

import java.util.List;
import java.util.Map;

public interface AbsSuperServiceInter {
    AbsSuperObject getModel();

    void setModel(AbsSuperObject model);

    IDoData getDao();

    KesunReturn findStuById();

    KesunReturn addStu();

    KesunReturn editStu();

    KesunReturn batchEditStu(Map<String, Object> cons);

    KesunReturn findStus(Map<String, Object> cons);

    KesunReturn delete();

    KesunReturn batchSaveStu(List<AbsSuperObject> objs);

    KesunReturn batchUpdat(List<AbsSuperObject> objs);

    KesunReturn getRowscount(Map<String, Object> cons);

    KesunReturn findByPage(Map<String, Object> cons, int startPage, int rowsCount);
}
