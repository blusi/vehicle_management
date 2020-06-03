package com.xinhong.buildcontrol.pojo;

public class CarRepairingProject {

    private String id;
    private String name;
    private int cost;
    private String repId;

    public CarRepairingProject() {
    }

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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getRepId() {
        return repId;
    }

    public void setRepId(String repId) {
        this.repId = repId;
    }

    public CarRepairingProject(String id, String name, int cost, String repId) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.repId = repId;
    }
}
