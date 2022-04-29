package com.kp.j2eedemo.dao;

import com.kp.j2eedemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

