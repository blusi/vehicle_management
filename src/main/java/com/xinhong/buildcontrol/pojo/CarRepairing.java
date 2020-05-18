package com.xinhong.buildcontrol.pojo;

import lombok.Data;

/**
 * 车辆修理表
 */
@Data
public class CarRepairing {

  private long repairingId;
  private long faultId;
  private long accidentId;
  private String repairingTime;
  private String repairingType;
  private double repairingCost;
  private String repairingNotes;
  private String repairingModified;
  private String repairingCreate;
  private String repairingOperator;


}
