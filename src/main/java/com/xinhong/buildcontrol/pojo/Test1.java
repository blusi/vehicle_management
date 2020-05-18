package com.xinhong.buildcontrol.pojo;


import lombok.Data;

@Data
public class Test1 {
    private Integer id;
    private String testName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Test1(Integer id, String testName) {
        this.id = id;
        this.testName = testName;
    }

    public Test1() {
    }
}
