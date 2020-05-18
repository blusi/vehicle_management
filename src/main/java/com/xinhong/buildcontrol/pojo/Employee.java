package com.xinhong.buildcontrol.pojo;

import lombok.Data;

/**
 * 员工实体
 */
@Data
public class Employee {

    private int employeeId;
    private String employeeName;
    private long employeeAge;
    private String employeeSex;
    private String employeeBirthday;
    private String employeeAddress;
    private String employeeIdCard;
    private long employeePhone;
    private String employeeDepartment;
    private long employeeWorkingYears;
    private String employeeCreate;
    private String employeeModified;
    private String employeeOperator;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeSex='" + employeeSex + '\'' +
                ", employeeBirthday='" + employeeBirthday + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeIdCard=" + employeeIdCard +
                ", employeePhone=" + employeePhone +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeWorkingYears=" + employeeWorkingYears +
                ", employeeCreate='" + employeeCreate + '\'' +
                ", employeeModified='" + employeeModified + '\'' +
                ", employeeOperator='" + employeeOperator + '\'' +
                '}';
    }

    public Employee(int employeeId, String employeeName, long employeeAge, String employeeSex, String employeeBirthday, String employeeAddress, String employeeIdCard, long employeePhone, String employeeDepartment, long employeeWorkingYears, String employeeCreate, String employeeModified, String employeeOperator) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSex = employeeSex;
        this.employeeBirthday = employeeBirthday;
        this.employeeAddress = employeeAddress;
        this.employeeIdCard = employeeIdCard;
        this.employeePhone = employeePhone;
        this.employeeDepartment = employeeDepartment;
        this.employeeWorkingYears = employeeWorkingYears;
        this.employeeCreate = employeeCreate;
        this.employeeModified = employeeModified;
        this.employeeOperator = employeeOperator;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(long employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(long employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public long getEmployeeWorkingYears() {
        return employeeWorkingYears;
    }

    public void setEmployeeWorkingYears(long employeeWorkingYears) {
        this.employeeWorkingYears = employeeWorkingYears;
    }

    public String getEmployeeCreate() {
        return employeeCreate;
    }

    public void setEmployeeCreate(String employeeCreate) {
        this.employeeCreate = employeeCreate;
    }

    public String getEmployeeModified() {
        return employeeModified;
    }

    public void setEmployeeModified(String employeeModified) {
        this.employeeModified = employeeModified;
    }

    public String getEmployeeOperator() {
        return employeeOperator;
    }

    public void setEmployeeOperator(String employeeOperator) {
        this.employeeOperator = employeeOperator;
    }
}
