package com.kp.j2eedemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Student extends AbsSuperObject{
    private String sno;//学号
    private StudentClass myClass;//班级
    private String mySex;//性别
    private int myAge;//年龄
    private String number;//电话号码

    public StudentClass getMyClass() { return myClass; }

    public void setMyClass(StudentClass myClass) { this.myClass = myClass; }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {this.sno = sno; }
    public String getMySex() {
        return mySex;
    }

    public void setMySex(String mySex) {
        this.mySex = mySex;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }
    public String getNumber() {return number; }
    public void setNumber(String number) { this.number = number;}

    @Override
    public String toString() {
        return "Student{" +
                "id="+super.getId()+
                "，名字="+super.getName()+
                "，学号='" + sno + '\'' +
                ", 班级=" + myClass+
                ", 性别='" + mySex + '\'' +
                ", 年龄=" + myAge +
                ", 手机号='" + number + '\'' +
                '}';
    }
}
