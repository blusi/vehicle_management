package com.xinhong.buildcontrol.pojo;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import lombok.Data;

/**
 * 事故表
 */
@Data
public class CarAccident {

  private String accidentId;
  private String carId;
  private String accidentTime;
  private String accidentSite;
  private String accidentType;
  private String accidentStatus;
  private String accidentNotes;
  private String accidentModified;
  private String accidentCreate;
  private String accidentOperator;
  private int isDelete;

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public String getAccidentId() {
    return accidentId;
  }

  public void setAccidentId(String accidentId) {
    this.accidentId = accidentId;
  }

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public String getAccidentTime() {
    return accidentTime;
  }

  public void setAccidentTime(String accidentTime) {
    this.accidentTime = accidentTime;
  }

  public String getAccidentSite() {
    return accidentSite;
  }

  public void setAccidentSite(String accidentSite) {
    this.accidentSite = accidentSite;
  }

  public String getAccidentType() {
    return accidentType;
  }

  public void setAccidentType(String accidentType) {
    this.accidentType = accidentType;
  }

  public String getAccidentStatus() {
    return accidentStatus;
  }

  public void setAccidentStatus(String accidentStatus) {
    this.accidentStatus = accidentStatus;
  }

  public String getAccidentNotes() {
    return accidentNotes;
  }

  public void setAccidentNotes(String accidentNotes) {
    this.accidentNotes = accidentNotes;
  }

  public String getAccidentModified() {
    return accidentModified;
  }

  public void setAccidentModified(String accidentModified) {
    this.accidentModified = accidentModified;
  }

  public String getAccidentCreate() {
    return accidentCreate;
  }

  public void setAccidentCreate(String accidentCreate) {
    this.accidentCreate = accidentCreate;
  }

  public String getAccidentOperator() {
    return accidentOperator;
  }

  public void setAccidentOperator(String accidentOperator) {
    this.accidentOperator = accidentOperator;
  }

  public CarAccident(String accidentId, String carId, String accidentTime, String accidentSite, String accidentType, String accidentStatus, String accidentNotes, String accidentModified, String accidentCreate, String accidentOperator) {
    this.accidentId = accidentId;
    this.carId = carId;
    this.accidentTime = accidentTime;
    this.accidentSite = accidentSite;
    this.accidentType = accidentType;
    this.accidentStatus = accidentStatus;
    this.accidentNotes = accidentNotes;
    this.accidentModified = accidentModified;
    this.accidentCreate = accidentCreate;
    this.accidentOperator = accidentOperator;
  }

  public CarAccident() {
  }
}
