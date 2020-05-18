package com.xinhong.buildcontrol.pojo;


import lombok.Data;

/**
 * 申请表
 */
@Data
public class CarApply {

  private long applyId;
  private long carId;
  private long employeeId;
  private String useInfo;
  private String applyRoute;
  private String applyTime;
  private String applyStatus;
  private String applyOperator;
  private String applyModified;
  private String applyCreate;



}
