package com.kp.j2eedemo.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentClass extends AbsSuperObject {
private String charger;
private String special;
private List<Student> stus;

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }
}
