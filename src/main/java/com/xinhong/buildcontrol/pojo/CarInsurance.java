package com.xinhong.buildcontrol.pojo;


import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * 保险表
 */
@Data
public class CarInsurance {

  @TableId
  private String insuranceId;
  private String carId;
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
  private int isDelete;

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public String getInsuranceId() {
    return insuranceId;
  }

  public void setInsuranceId(String insuranceId) {
    this.insuranceId = insuranceId;
  }

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public String getInsurancePlace() {
    return insurancePlace;
  }

  public void setInsurancePlace(String insurancePlace) {
    this.insurancePlace = insurancePlace;
  }

  public long getInsuranceCommercialCost() {
    return insuranceCommercialCost;
  }

  public void setInsuranceCommercialCost(long insuranceCommercialCost) {
    this.insuranceCommercialCost = insuranceCommercialCost;
  }

  public long getInsuranceStrongCost() {
    return insuranceStrongCost;
  }

  public void setInsuranceStrongCost(long insuranceStrongCost) {
    this.insuranceStrongCost = insuranceStrongCost;
  }

  public long getInsuranceElseCost() {
    return insuranceElseCost;
  }

  public void setInsuranceElseCost(long insuranceElseCost) {
    this.insuranceElseCost = insuranceElseCost;
  }

  public String getInsuranceBeginTime() {
    return insuranceBeginTime;
  }

  public void setInsuranceBeginTime(String insuranceBeginTime) {
    this.insuranceBeginTime = insuranceBeginTime;
  }

  public String getInsuranceEndTime() {
    return insuranceEndTime;
  }

  public void setInsuranceEndTime(String insuranceEndTime) {
    this.insuranceEndTime = insuranceEndTime;
  }

  public String getInsuranceNotes() {
    return insuranceNotes;
  }

  public void setInsuranceNotes(String insuranceNotes) {
    this.insuranceNotes = insuranceNotes;
  }

  public String getInsuranceVoucher() {
    return insuranceVoucher;
  }

  public void setInsuranceVoucher(String insuranceVoucher) {
    this.insuranceVoucher = insuranceVoucher;
  }

  public String getInsuranceOperator() {
    return insuranceOperator;
  }

  public void setInsuranceOperator(String insuranceOperator) {
    this.insuranceOperator = insuranceOperator;
  }

  public String getInsuranceModified() {
    return insuranceModified;
  }

  public void setInsuranceModified(String insuranceModified) {
    this.insuranceModified = insuranceModified;
  }

  public String getInsuranceCreate() {
    return insuranceCreate;
  }

  public void setInsuranceCreate(String insuranceCreate) {
    this.insuranceCreate = insuranceCreate;
  }

  public CarInsurance(String insuranceId, String carId, String insurancePlace, long insuranceCommercialCost, long insuranceStrongCost, long insuranceElseCost, String insuranceBeginTime, String insuranceEndTime, String insuranceNotes, String insuranceVoucher, String insuranceOperator, String insuranceModified, String insuranceCreate) {
    this.insuranceId = insuranceId;
    this.carId = carId;
    this.insurancePlace = insurancePlace;
    this.insuranceCommercialCost = insuranceCommercialCost;
    this.insuranceStrongCost = insuranceStrongCost;
    this.insuranceElseCost = insuranceElseCost;
    this.insuranceBeginTime = insuranceBeginTime;
    this.insuranceEndTime = insuranceEndTime;
    this.insuranceNotes = insuranceNotes;
    this.insuranceVoucher = insuranceVoucher;
    this.insuranceOperator = insuranceOperator;
    this.insuranceModified = insuranceModified;
    this.insuranceCreate = insuranceCreate;
  }

  public CarInsurance() {
  }
}
