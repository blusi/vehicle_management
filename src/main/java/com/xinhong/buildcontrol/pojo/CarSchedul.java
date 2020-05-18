package com.xinhong.buildcontrol.pojo;

import lombok.Data;

/**
 * 排班表
 */
@Data
public class CarSchedul {

  private long schedulId;
  private long carId;
  private String schedulStatus;
  private String schedulAppointmentInfo;
  private String schedulNotes;
  private String schedulOperator;
  private String schedulModified;
  private String schedulCreate;


}
