package com.xinhong.buildcontrol.pojo;


import lombok.Data;

/**
 * 保险表
 */
@Data
public class CarInsurance {

  private long insuranceId;
  private long carId;
  private String insurancePlace;
  private long insuranceCommercialCost;
  private long insuranceStrongCost;
  private long insuranceElseCost;
  private String insuranceBeginTime;
  private String insuranceEndTime;
  private String insuranceNotes;
  private String insuranceVoucher;
  private String insuranceOperator;
  private String insuranceModified;
  private String insuranceCreate;


}
