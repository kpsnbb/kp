package com.jkh.j2eedemo.entity;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

public abstract class AbsSuperObject implements Serializable {
    private String id;
    private String name;
    private Date createDate;
    private Date lastUpdate;
    private Date bussinessDate;
    private String description;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getBussinessDate() {
        return bussinessDate;
    }

    public void setBussinessDate(Date bussinessDate) {
        this.bussinessDate = bussinessDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AbsSuperObject{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", lastUpdate=" + lastUpdate +
                ", bussinessDate=" + bussinessDate +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
