package com.kp.j2eedemo.dao;

import com.kp.j2eedemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentClass extends IDoData {
 List<Student> findStus(String id);
}
