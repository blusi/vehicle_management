package com.xinhong.buildcontrol.pojo;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * 排班表
 */
@Data
public class CarSchedul {

  @TableId
  private String schedulId;

  private String carId;
  private String schedulStatus;
  private String schedulAppointmentInfo;
  private String schedulNotes;
  private String schedulOperator;
  private String schedulModified;
  private String schedulCreate;
  private int isDelete;

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public String getSchedulId() {
    return schedulId;
  }

  public void setSchedulId(String schedulId) {
    this.schedulId = schedulId;
  }

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public String getSchedulStatus() {
    return schedulStatus;
  }

  public void setSchedulStatus(String schedulStatus) {
    this.schedulStatus = schedulStatus;
  }

  public String getSchedulAppointmentInfo() {
    return schedulAppointmentInfo;
  }

  public void setSchedulAppointmentInfo(String schedulAppointmentInfo) {
    this.schedulAppointmentInfo = schedulAppointmentInfo;
  }

  public String getSchedulNotes() {
    return schedulNotes;
  }

  public void setSchedulNotes(String schedulNotes) {
    this.schedulNotes = schedulNotes;
  }

  public String getSchedulOperator() {
    return schedulOperator;
  }

  public void setSchedulOperator(String schedulOperator) {
    this.schedulOperator = schedulOperator;
  }

  public String getSchedulModified() {
    return schedulModified;
  }

  public void setSchedulModified(String schedulModified) {
    this.schedulModified = schedulModified;
  }

  public String getSchedulCreate() {
    return schedulCreate;
  }

  public void setSchedulCreate(String schedulCreate) {
    this.schedulCreate = schedulCreate;
  }

  public CarSchedul(String schedulId, String carId, String schedulStatus, String schedulAppointmentInfo, String schedulNotes, String schedulOperator, String schedulModified, String schedulCreate) {
    this.schedulId = schedulId;
    this.carId = carId;
    this.schedulStatus = schedulStatus;
    this.schedulAppointmentInfo = schedulAppointmentInfo;
    this.schedulNotes = schedulNotes;
    this.schedulOperator = schedulOperator;
    this.schedulModified = schedulModified;
    this.schedulCreate = schedulCreate;
  }

  public CarSchedul() {
  }

}
