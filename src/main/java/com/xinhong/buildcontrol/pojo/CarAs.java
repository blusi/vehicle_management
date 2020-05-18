package com.xinhong.buildcontrol.pojo;


import lombok.Data;

/**
 * 年检表
 */
@Data
public class CarAs {

  private long asId;
  private long carId;
  private String asTime;
  private String asNextTime;
  private long asCost;
  private long asPlace;
  private long asNotes;
  private long asInvoices;
  private String asOperator;
  private String asModified;
  private String asCreate;


}
