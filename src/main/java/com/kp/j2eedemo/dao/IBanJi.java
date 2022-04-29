package com.kp.j2eedemo.dao;


import com.kp.j2eedemo.entity.StudentClass;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface IBanJi {
    @Select("select id,name,charger from studentclass where charger=#{charger}")
    List<StudentClass> findStudentClass(Map<String,Object>cons);
    @Insert("insert into studentclass (id,name,charger)"+"values(#{sc.id},#{sc.name},#{sc.charger})")
    int addClass(StudentClass sc);
    @Update("update studentclass set name=#{sc.name} where id =#{sc.id}")
    int editStuClass(StudentClass sc);
}
