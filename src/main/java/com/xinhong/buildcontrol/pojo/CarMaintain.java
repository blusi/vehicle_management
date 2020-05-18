package com.xinhong.buildcontrol.pojo;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * 保养表
 */
@Data
public class CarMaintain {

  @TableId
  private String maintainId;
  private String carId;
  private long maintainPlace;
  private String maintainThisTime;
  private long maintainThisKm;
  private String maintainNextTime;
  private long maintainNextKm;
  private String maintainProject;
  private long maintainCost;
  private String maintainNotes;
  private String maintainReceipts;
  private String maintainOperator;
  private String maintainModified;
  private String maintainCreate;
  private int isDelete;

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public String getMaintainId() {
    return maintainId;
  }

  public void setMaintainId(String maintainId) {
    this.maintainId = maintainId;
  }

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public long getMaintainPlace() {
    return maintainPlace;
  }

  public void setMaintainPlace(long maintainPlace) {
    this.maintainPlace = maintainPlace;
  }

  public String getMaintainThisTime() {
    return maintainThisTime;
  }

  public void setMaintainThisTime(String maintainThisTime) {
    this.maintainThisTime = maintainThisTime;
  }

  public long getMaintainThisKm() {
    return maintainThisKm;
  }

  public void setMaintainThisKm(long maintainThisKm) {
    this.maintainThisKm = maintainThisKm;
  }

  public String getMaintainNextTime() {
    return maintainNextTime;
  }

  public void setMaintainNextTime(String maintainNextTime) {
    this.maintainNextTime = maintainNextTime;
  }

  public long getMaintainNextKm() {
    return maintainNextKm;
  }

  public void setMaintainNextKm(long maintainNextKm) {
    this.maintainNextKm = maintainNextKm;
  }

  public String getMaintainProject() {
    return maintainProject;
  }

  public void setMaintainProject(String maintainProject) {
    this.maintainProject = maintainProject;
  }

  public long getMaintainCost() {
    return maintainCost;
  }

  public void setMaintainCost(long maintainCost) {
    this.maintainCost = maintainCost;
  }

  public String getMaintainNotes() {
    return maintainNotes;
  }

  public void setMaintainNotes(String maintainNotes) {
    this.maintainNotes = maintainNotes;
  }

  public String getMaintainReceipts() {
    return maintainReceipts;
  }

  public void setMaintainReceipts(String maintainReceipts) {
    this.maintainReceipts = maintainReceipts;
  }

  public String getMaintainOperator() {
    return maintainOperator;
  }

  public void setMaintainOperator(String maintainOperator) {
    this.maintainOperator = maintainOperator;
  }

  public String getMaintainModified() {
    return maintainModified;
  }

  public void setMaintainModified(String maintainModified) {
    this.maintainModified = maintainModified;
  }

  public String getMaintainCreate() {
    return maintainCreate;
  }

  public void setMaintainCreate(String maintainCreate) {
    this.maintainCreate = maintainCreate;
  }

  public CarMaintain(String maintainId, String carId, long maintainPlace, String maintainThisTime, long maintainThisKm, String maintainNextTime, long maintainNextKm, String maintainProject, long maintainCost, String maintainNotes, String maintainReceipts, String maintainOperator, String maintainModified, String maintainCreate) {
    this.maintainId = maintainId;
    this.carId = carId;
    this.maintainPlace = maintainPlace;
    this.maintainThisTime = maintainThisTime;
    this.maintainThisKm = maintainThisKm;
    this.maintainNextTime = maintainNextTime;
    this.maintainNextKm = maintainNextKm;
    this.maintainProject = maintainProject;
    this.maintainCost = maintainCost;
    this.maintainNotes = maintainNotes;
    this.maintainReceipts = maintainReceipts;
    this.maintainOperator = maintainOperator;
    this.maintainModified = maintainModified;
    this.maintainCreate = maintainCreate;
  }

  public CarMaintain() {
  }
}
