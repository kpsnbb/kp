package com.jkh.j2eedemo.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Employee extends AbsSuperObject{
    //定义员工类

    private char sex;//性别
    private Date birthday;//出生年月
    private String position;//岗位
    private String number;


    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }



    public String getPosition() {return position; }

    public void setPosition(String position) { this.position = position; }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
