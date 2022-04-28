package com.jkh.j2eedemo.dao;

import com.jkh.j2eedemo.entity.Employee;
import com.jkh.j2eedemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface IStudent extends IDoData{
/**
 * description:findMe
 * date: 2022/4/6 16:25
 * author:jkh
 * @param id
 */
@Select("select * from student where id=#{id}")
    Student findMe(String id);
}

