package com.xinhong.buildcontrol.pojo;

import lombok.Data;

/**
 * 派车表
 */
@Data
public class CarSend {

  private long sendId;
  private long carId;
  private long driverId;
  private String sendTime;
  private String sendStart;
  private String sendDestination;
  private String sendReason;
  private String sendPassenger;
  private String sendOperator;
  private String sendModified;
  private String sendCreate;


}
