package com.xinhong.buildcontrol.pojo;

import com.baomidou.mybatisplus.annotations.TableId;
import com.sun.javafx.beans.IDProperty;

public class CarMaintainProject {
    @TableId
    private String proId;
    private String maintainId;
    private String proName;
    private double cost;
    private String proCreate;

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getMaintainId() {
        return maintainId;
    }

    public void setMaintainId(String maintainId) {
        this.maintainId = maintainId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getProCreate() {
        return proCreate;
    }

    public void setProCreate(String proCreate) {
        this.proCreate = proCreate;
    }

    public CarMaintainProject(String proId, String maintainId, String proName, double cost, String proCreate) {
        this.proId = proId;
        this.maintainId = maintainId;
        this.proName = proName;
        this.cost = cost;
        this.proCreate = proCreate;
    }

    public CarMaintainProject() {
    }
}
