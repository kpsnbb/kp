package com.jkh.j2eedemo.dao;

import com.jkh.j2eedemo.entity.AbsSuperObject;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * description:IDoData dao层超级接口
 * date: 2022/3/26 0:13
 * author:jkh
 */
public interface IDoData {
    //    查找单个对象
    AbsSuperObject findById(String id);

    //    添加一个对象
    @Transactional
    int add(AbsSuperObject obj);

    //    批量查找
    List<Map<String, Object>> find(Map<String, Object> cons);

    //    批量保存
    @Transactional
    int batchSave(List objs);

    //    修改单个对象
    @Transactional
    int edit(AbsSuperObject obj);

    //    批量修改
    @Transactional
    int batchEdit(Map<String, Object> cons);

    //    删除单个对象
    @Transactional
    int del(AbsSuperObject obj);

    //    批量删除
    @Transactional
    int batchDel(Map<String, Object> cons);
    @Transactional
    int batchUpdat(List<AbsSuperObject> objs);

    List<AbsSuperObject> findByPage(Map<String,Object> cons);
    int getRowsCount(Map<String,Object> cons);
}
