package com.xinhong.buildcontrol.pojo;


import lombok.Data;

/**
 * 司机实体
 */
@Data
public class DriverInfo {

  private long driverId;
  private long employeeId;
  private long driverDrivingLicense;
  private String driverIssueDate;
  private String driverStatus;
  private String driverModified;
  private String driverCreate;
  private String driverOperator;
  private Employee employee;

  public long getDriverId() {
    return driverId;
  }

  public void setDriverId(long driverId) {
    this.driverId = driverId;
  }

  public long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

  public long getDriverDrivingLicense() {
    return driverDrivingLicense;
  }

  public void setDriverDrivingLicense(long driverDrivingLicense) {
    this.driverDrivingLicense = driverDrivingLicense;
  }

  public String getDriverIssueDate() {
    return driverIssueDate;
  }

  public void setDriverIssueDate(String driverIssueDate) {
    this.driverIssueDate = driverIssueDate;
  }

  public String getDriverStatus() {
    return driverStatus;
  }

  public void setDriverStatus(String driverStatus) {
    this.driverStatus = driverStatus;
  }

  public String getDriverModified() {
    return driverModified;
  }

  public void setDriverModified(String driverModified) {
    this.driverModified = driverModified;
  }

  public String getDriverCreate() {
    return driverCreate;
  }

  public void setDriverCreate(String driverCreate) {
    this.driverCreate = driverCreate;
  }

  public String getDriverOperator() {
    return driverOperator;
  }

  public void setDriverOperator(String driverOperator) {
    this.driverOperator = driverOperator;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public DriverInfo(long driverId, long employeeId, long driverDrivingLicense, String driverIssueDate, String driverStatus, String driverModified, String driverCreate, String driverOperator, Employee employee) {
    this.driverId = driverId;
    this.employeeId = employeeId;
    this.driverDrivingLicense = driverDrivingLicense;
    this.driverIssueDate = driverIssueDate;
    this.driverStatus = driverStatus;
    this.driverModified = driverModified;
    this.driverCreate = driverCreate;
    this.driverOperator = driverOperator;
    this.employee = employee;
  }

  public DriverInfo() {
  }
}
