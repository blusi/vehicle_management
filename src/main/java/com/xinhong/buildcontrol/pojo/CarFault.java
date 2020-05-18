package com.xinhong.buildcontrol.pojo;


import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * 汽车故障实体
 */
@Data
public class CarFault {

  @TableId
  private String faultId;
  private String carId;
  private String faultTime;
  private String faultSite;
  private String faultType;
  private String faultStatus;
  private String faultNotes;
  private String faultModified;
  private String faultCreate;
  private String faultOperator;
  private int isDelete;

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public String getFaultId() {
    return faultId;
  }

  public void setFaultId(String faultId) {
    this.faultId = faultId;
  }

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public String getFaultTime() {
    return faultTime;
  }

  public void setFaultTime(String faultTime) {
    this.faultTime = faultTime;
  }

  public String getFaultSite() {
    return faultSite;
  }

  public void setFaultSite(String faultSite) {
    this.faultSite = faultSite;
  }

  public String getFaultType() {
    return faultType;
  }

  public void setFaultType(String faultType) {
    this.faultType = faultType;
  }

  public String getFaultStatus() {
    return faultStatus;
  }

  public void setFaultStatus(String faultStatus) {
    this.faultStatus = faultStatus;
  }

  public String getFaultNotes() {
    return faultNotes;
  }

  public void setFaultNotes(String faultNotes) {
    this.faultNotes = faultNotes;
  }

  public String getFaultModified() {
    return faultModified;
  }

  public void setFaultModified(String faultModified) {
    this.faultModified = faultModified;
  }

  public String getFaultCreate() {
    return faultCreate;
  }

  public void setFaultCreate(String faultCreate) {
    this.faultCreate = faultCreate;
  }

  public String getFaultOperator() {
    return faultOperator;
  }

  public void setFaultOperator(String faultOperator) {
    this.faultOperator = faultOperator;
  }

  public CarFault(String faultId, String carId, String faultTime, String faultSite, String faultType, String faultStatus, String faultNotes, String faultModified, String faultCreate, String faultOperator) {
    this.faultId = faultId;
    this.carId = carId;
    this.faultTime = faultTime;
    this.faultSite = faultSite;
    this.faultType = faultType;
    this.faultStatus = faultStatus;
    this.faultNotes = faultNotes;
    this.faultModified = faultModified;
    this.faultCreate = faultCreate;
    this.faultOperator = faultOperator;
  }

  public CarFault() {
  }
}
