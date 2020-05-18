package com.xinhong.buildcontrol.pojo;

import lombok.Data;

/**
 * 保养表
 */
@Data
public class CarMaintain {

  private long maintainId;
  private long carId;
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


}
