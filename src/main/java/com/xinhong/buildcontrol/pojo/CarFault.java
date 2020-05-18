package com.xinhong.buildcontrol.pojo;


import lombok.Data;

/**
 * 汽车故障实体
 */
@Data
public class CarFault {

  private long faultId;
  private long carId;
  private java.sql.Date faultTime;
  private String faultSite;
  private String faultType;
  private String faultStatus;
  private String faultNotes;
  private String faultModified;
  private String faultCreate;
  private String faultOperator;


}
