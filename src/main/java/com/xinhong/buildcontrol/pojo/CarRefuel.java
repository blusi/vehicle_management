package com.xinhong.buildcontrol.pojo;

import lombok.Data;

/**
 * 加油表
 */
@Data
public class CarRefuel {

  private long refuelId;
  private long carId;
  private long refuelTime;
  private long refuelCost;
  private long refuelGasolineNumber;
  private long refuelPrice;
  private long refuelQuantity;
  private String refuelStation;
  private long refuelPresentMileage;
  private long refuelRemainMileage;
  private String refuelNotes;
  private String refuelDocumentsInfo;
  private String refuelCreate;
  private String refuelModified;
  private String refuelOperator;


}
