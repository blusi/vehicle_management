package com.xinhong.buildcontrol.pojo;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * 加油表
 */
@Data
public class CarRefuel {

  @TableId
  private String refuelId;
  private String carId;
  private String refuelTime;
  private long refuelCost;
  private long refuelGasolineNumber;
  private long refuelPrice;
  private Double refuelQuantity;
  private String refuelStation;
  private long refuelPresentMileage;
  private long refuelRemainMileage;
  private String refuelNotes;
  private String refuelDocumentsInfo;
  private String refuelCreate;
  private String refuelModified;
  private String refuelOperator;
  private int isDelete;
  private CarInfo carInfo;

    public CarInfo getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    public int getIsDelete() {
    return isDelete;
      }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public String getRefuelId() {
    return refuelId;
  }

  public void setRefuelId(String refuelId) {
    this.refuelId = refuelId;
  }

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public String getRefuelTime() {
    return refuelTime;
  }

  public void setRefuelTime(String refuelTime) {
    this.refuelTime = refuelTime;
  }

  public long getRefuelCost() {
    return refuelCost;
  }

  public void setRefuelCost(long refuelCost) {
    this.refuelCost = refuelCost;
  }

  public long getRefuelGasolineNumber() {
    return refuelGasolineNumber;
  }

  public void setRefuelGasolineNumber(long refuelGasolineNumber) {
    this.refuelGasolineNumber = refuelGasolineNumber;
  }

  public long getRefuelPrice() {
    return refuelPrice;
  }

  public void setRefuelPrice(long refuelPrice) {
    this.refuelPrice = refuelPrice;
  }

    public Double getRefuelQuantity() {
        return refuelQuantity;
    }

    public void setRefuelQuantity(Double refuelQuantity) {
        this.refuelQuantity = refuelQuantity;
    }

    public String getRefuelStation() {
    return refuelStation;
  }

  public void setRefuelStation(String refuelStation) {
    this.refuelStation = refuelStation;
  }

  public long getRefuelPresentMileage() {
    return refuelPresentMileage;
  }

  public void setRefuelPresentMileage(long refuelPresentMileage) {
    this.refuelPresentMileage = refuelPresentMileage;
  }

  public long getRefuelRemainMileage() {
    return refuelRemainMileage;
  }

  public void setRefuelRemainMileage(long refuelRemainMileage) {
    this.refuelRemainMileage = refuelRemainMileage;
  }

  public String getRefuelNotes() {
    return refuelNotes;
  }

  public void setRefuelNotes(String refuelNotes) {
    this.refuelNotes = refuelNotes;
  }

  public String getRefuelDocumentsInfo() {
    return refuelDocumentsInfo;
  }

  public void setRefuelDocumentsInfo(String refuelDocumentsInfo) {
    this.refuelDocumentsInfo = refuelDocumentsInfo;
  }

  public String getRefuelCreate() {
    return refuelCreate;
  }

  public void setRefuelCreate(String refuelCreate) {
    this.refuelCreate = refuelCreate;
  }

  public String getRefuelModified() {
    return refuelModified;
  }

  public void setRefuelModified(String refuelModified) {
    this.refuelModified = refuelModified;
  }

  public String getRefuelOperator() {
    return refuelOperator;
  }

  public void setRefuelOperator(String refuelOperator) {
    this.refuelOperator = refuelOperator;
  }

  public CarRefuel(String refuelId, String carId, String refuelTime, long refuelCost, long refuelGasolineNumber, long refuelPrice, Double refuelQuantity, String refuelStation, long refuelPresentMileage, long refuelRemainMileage, String refuelNotes, String refuelDocumentsInfo, String refuelCreate, String refuelModified, String refuelOperator) {
    this.refuelId = refuelId;
    this.carId = carId;
    this.refuelTime = refuelTime;
    this.refuelCost = refuelCost;
    this.refuelGasolineNumber = refuelGasolineNumber;
    this.refuelPrice = refuelPrice;
    this.refuelQuantity = refuelQuantity;
    this.refuelStation = refuelStation;
    this.refuelPresentMileage = refuelPresentMileage;
    this.refuelRemainMileage = refuelRemainMileage;
    this.refuelNotes = refuelNotes;
    this.refuelDocumentsInfo = refuelDocumentsInfo;
    this.refuelCreate = refuelCreate;
    this.refuelModified = refuelModified;
    this.refuelOperator = refuelOperator;
  }

  public CarRefuel() {
  }
}
