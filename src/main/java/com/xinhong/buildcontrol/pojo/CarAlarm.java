package com.xinhong.buildcontrol.pojo;


import lombok.Data;

/**
 * 警报表
 */
@Data
public class CarAlarm {

  private long alarmId;
  private long carId;
  private String alarmTime;
  private String alarmInfo;
  private String alarmOperator;
  private String alarmModified;
  private String alarmCreate;


}
