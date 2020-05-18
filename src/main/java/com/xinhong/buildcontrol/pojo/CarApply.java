package com.xinhong.buildcontrol.pojo;


import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * 申请表
 */
@Data
public class CarApply {
  @TableId
  private String applyId;
  private String carId;
  private long employeeId;
  private String useInfo;
  private String applyRoute;
  private String applyTime;
  private String applyStatus;
  private String applyOperator;
  private String applyModified;
  private String applyCreate;
  private int isDelete;

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public String getApplyId() {
    return applyId;
  }

  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

  public String getUseInfo() {
    return useInfo;
  }

  public void setUseInfo(String useInfo) {
    this.useInfo = useInfo;
  }

  public String getApplyRoute() {
    return applyRoute;
  }

  public void setApplyRoute(String applyRoute) {
    this.applyRoute = applyRoute;
  }

  public String getApplyTime() {
    return applyTime;
  }

  public void setApplyTime(String applyTime) {
    this.applyTime = applyTime;
  }

  public String getApplyStatus() {
    return applyStatus;
  }

  public void setApplyStatus(String applyStatus) {
    this.applyStatus = applyStatus;
  }

  public String getApplyOperator() {
    return applyOperator;
  }

  public void setApplyOperator(String applyOperator) {
    this.applyOperator = applyOperator;
  }

  public String getApplyModified() {
    return applyModified;
  }

  public void setApplyModified(String applyModified) {
    this.applyModified = applyModified;
  }

  public String getApplyCreate() {
    return applyCreate;
  }

  public void setApplyCreate(String applyCreate) {
    this.applyCreate = applyCreate;
  }

  public CarApply(String applyId, String carId, long employeeId, String useInfo, String applyRoute, String applyTime, String applyStatus, String applyOperator, String applyModified, String applyCreate) {
    this.applyId = applyId;
    this.carId = carId;
    this.employeeId = employeeId;
    this.useInfo = useInfo;
    this.applyRoute = applyRoute;
    this.applyTime = applyTime;
    this.applyStatus = applyStatus;
    this.applyOperator = applyOperator;
    this.applyModified = applyModified;
    this.applyCreate = applyCreate;
  }

  public CarApply() {
  }
}
