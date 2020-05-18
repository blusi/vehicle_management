package com.xinhong.buildcontrol.pojo;


import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * 年检表
 */
@Data
public class CarAs {

  @TableId
  private String asId;
  private String carId;
  private String asTime;
  private String asNextTime;
  private long asCost;
  private long asPlace;
  private long asNotes;
  private long asInvoices;
  private String asOperator;
  private String asModified;
  private String asCreate;
  private int isDelete;

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public String getAsId() {
    return asId;
  }

  public void setAsId(String asId) {
    this.asId = asId;
  }

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public String getAsTime() {
    return asTime;
  }

  public void setAsTime(String asTime) {
    this.asTime = asTime;
  }

  public String getAsNextTime() {
    return asNextTime;
  }

  public void setAsNextTime(String asNextTime) {
    this.asNextTime = asNextTime;
  }

  public long getAsCost() {
    return asCost;
  }

  public void setAsCost(long asCost) {
    this.asCost = asCost;
  }

  public long getAsPlace() {
    return asPlace;
  }

  public void setAsPlace(long asPlace) {
    this.asPlace = asPlace;
  }

  public long getAsNotes() {
    return asNotes;
  }

  public void setAsNotes(long asNotes) {
    this.asNotes = asNotes;
  }

  public long getAsInvoices() {
    return asInvoices;
  }

  public void setAsInvoices(long asInvoices) {
    this.asInvoices = asInvoices;
  }

  public String getAsOperator() {
    return asOperator;
  }

  public void setAsOperator(String asOperator) {
    this.asOperator = asOperator;
  }

  public String getAsModified() {
    return asModified;
  }

  public void setAsModified(String asModified) {
    this.asModified = asModified;
  }

  public String getAsCreate() {
    return asCreate;
  }

  public void setAsCreate(String asCreate) {
    this.asCreate = asCreate;
  }

  public CarAs(String asId, String carId, String asTime, String asNextTime, long asCost, long asPlace, long asNotes, long asInvoices, String asOperator, String asModified, String asCreate) {
    this.asId = asId;
    this.carId = carId;
    this.asTime = asTime;
    this.asNextTime = asNextTime;
    this.asCost = asCost;
    this.asPlace = asPlace;
    this.asNotes = asNotes;
    this.asInvoices = asInvoices;
    this.asOperator = asOperator;
    this.asModified = asModified;
    this.asCreate = asCreate;
  }

  public CarAs() {
  }
}
