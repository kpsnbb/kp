package com.kp.j2eedemo.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Log extends AbsSuperObject {
    private String moduleName;
    private String actionName;
    private String params;
    private String returnValue;
    private Date finishDate;
    private float spendTime;

    public float getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(float spendTime) {
        this.spendTime = spendTime;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
}
