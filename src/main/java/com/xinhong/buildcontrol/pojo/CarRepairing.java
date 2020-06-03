package com.xinhong.buildcontrol.pojo;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import org.apache.catalina.LifecycleState;

import java.util.List;

/**
 * 车辆修理表
 */
@Data
public class CarRepairing {

  @TableId
  private String repairingId;
  private String faultId;
  private String accidentId;
  private String carId;
  private String repairingTime;
  private String repairingType;
  private double repairingCost;
  private String repairingNotes;
  private String repairingModified;
  private String repairingCreate;
  private String repairingOperator;
  private int isDelete;

  private List<CarRepairingProject> carRepairingProjectList;

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public List<CarRepairingProject> getCarRepairingProjectList() {
    return carRepairingProjectList;
  }

  public void setCarRepairingProjectList(List<CarRepairingProject> carRepairingProjectList) {
    this.carRepairingProjectList = carRepairingProjectList;
  }

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public String getRepairingId() {
    return repairingId;
  }

  public void setRepairingId(String repairingId) {
    this.repairingId = repairingId;
  }

  public String getFaultId() {
    return faultId;
  }

  public void setFaultId(String faultId) {
    this.faultId = faultId;
  }

  public String getAccidentId() {
    return accidentId;
  }

  public void setAccidentId(String accidentId) {
    this.accidentId = accidentId;
  }

  public String getRepairingTime() {
    return repairingTime;
  }

  public void setRepairingTime(String repairingTime) {
    this.repairingTime = repairingTime;
  }

  public String getRepairingType() {
    return repairingType;
  }

  public void setRepairingType(String repairingType) {
    this.repairingType = repairingType;
  }

  public double getRepairingCost() {
    return repairingCost;
  }

  public void setRepairingCost(double repairingCost) {
    this.repairingCost = repairingCost;
  }

  public String getRepairingNotes() {
    return repairingNotes;
  }

  public void setRepairingNotes(String repairingNotes) {
    this.repairingNotes = repairingNotes;
  }

  public String getRepairingModified() {
    return repairingModified;
  }

  public void setRepairingModified(String repairingModified) {
    this.repairingModified = repairingModified;
  }

  public String getRepairingCreate() {
    return repairingCreate;
  }

  public void setRepairingCreate(String repairingCreate) {
    this.repairingCreate = repairingCreate;
  }

  public String getRepairingOperator() {
    return repairingOperator;
  }

  public void setRepairingOperator(String repairingOperator) {
    this.repairingOperator = repairingOperator;
  }

  public CarRepairing(String repairingId, String faultId, String accidentId, String repairingTime, String repairingType, double repairingCost, String repairingNotes, String repairingModified, String repairingCreate, String repairingOperator) {
    this.repairingId = repairingId;
    this.faultId = faultId;
    this.accidentId = accidentId;
    this.repairingTime = repairingTime;
    this.repairingType = repairingType;
    this.repairingCost = repairingCost;
    this.repairingNotes = repairingNotes;
    this.repairingModified = repairingModified;
    this.repairingCreate = repairingCreate;
    this.repairingOperator = repairingOperator;
  }

  public CarRepairing() {
  }
}
