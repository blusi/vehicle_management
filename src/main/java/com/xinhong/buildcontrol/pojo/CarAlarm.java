package com.xinhong.buildcontrol.pojo;


import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * 警报表
 */
@Data
public class CarAlarm {

  @TableId
  private String alarmId;
  private String carId;
  private String alarmTime;
  private String alarmInfo;

  private String alarmOperator;
  private String alarmModified;
  private String alarmCreate;
  private int isDelete;

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public String getAlarmId() {
    return alarmId;
  }

  public void setAlarmId(String alarmId) {
    this.alarmId = alarmId;
  }

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public String getAlarmTime() {
    return alarmTime;
  }

  public void setAlarmTime(String alarmTime) {
    this.alarmTime = alarmTime;
  }

  public String getAlarmInfo() {
    return alarmInfo;
  }

  public void setAlarmInfo(String alarmInfo) {
    this.alarmInfo = alarmInfo;
  }

  public String getAlarmOperator() {
    return alarmOperator;
  }

  public void setAlarmOperator(String alarmOperator) {
    this.alarmOperator = alarmOperator;
  }

  public String getAlarmModified() {
    return alarmModified;
  }

  public void setAlarmModified(String alarmModified) {
    this.alarmModified = alarmModified;
  }

  public String getAlarmCreate() {
    return alarmCreate;
  }

  public void setAlarmCreate(String alarmCreate) {
    this.alarmCreate = alarmCreate;
  }

  public CarAlarm(String alarmId, String carId, String alarmTime, String alarmInfo, String alarmOperator, String alarmModified, String alarmCreate) {
    this.alarmId = alarmId;
    this.carId = carId;
    this.alarmTime = alarmTime;
    this.alarmInfo = alarmInfo;
    this.alarmOperator = alarmOperator;
    this.alarmModified = alarmModified;
    this.alarmCreate = alarmCreate;
  }

  public CarAlarm() {
  }
}
