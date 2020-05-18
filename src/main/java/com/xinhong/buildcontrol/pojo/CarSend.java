package com.xinhong.buildcontrol.pojo;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

/**
 * 派车表
 */
@Data
public class CarSend {

  @TableId
  private String sendId;
  private String carId;
  private String driverId;
  private String sendTime;
  private String sendStart;
  private String sendDestination;
  private String sendReason;
  private String sendPassenger;
  private String sendOperator;
  private String sendModified;
  private String sendCreate;
  private int isDelete;

  public String getSendId() {
    return sendId;
  }

  public String getCarId() {
    return carId;
  }

  public String getDriverId() {
    return driverId;
  }

  public String getSendTime() {
    return sendTime;
  }

  public String getSendStart() {
    return sendStart;
  }

  public String getSendDestination() {
    return sendDestination;
  }

  public String getSendReason() {
    return sendReason;
  }

  public String getSendPassenger() {
    return sendPassenger;
  }

  public String getSendOperator() {
    return sendOperator;
  }

  public String getSendModified() {
    return sendModified;
  }

  public String getSendCreate() {
    return sendCreate;
  }

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public void setSendId(String sendId) {
    this.sendId = sendId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public void setDriverId(String driverId) {
    this.driverId = driverId;
  }

  public void setSendTime(String sendTime) {
    this.sendTime = sendTime;
  }

  public void setSendStart(String sendStart) {
    this.sendStart = sendStart;
  }

  public void setSendDestination(String sendDestination) {
    this.sendDestination = sendDestination;
  }

  public void setSendReason(String sendReason) {
    this.sendReason = sendReason;
  }

  public void setSendPassenger(String sendPassenger) {
    this.sendPassenger = sendPassenger;
  }

  public void setSendOperator(String sendOperator) {
    this.sendOperator = sendOperator;
  }

  public void setSendModified(String sendModified) {
    this.sendModified = sendModified;
  }

  public void setSendCreate(String sendCreate) {
    this.sendCreate = sendCreate;
  }

  public CarSend(String sendId, String carId, String driverId, String sendTime, String sendStart, String sendDestination, String sendReason, String sendPassenger, String sendOperator, String sendModified, String sendCreate) {
    this.sendId = sendId;
    this.carId = carId;
    this.driverId = driverId;
    this.sendTime = sendTime;
    this.sendStart = sendStart;
    this.sendDestination = sendDestination;
    this.sendReason = sendReason;
    this.sendPassenger = sendPassenger;
    this.sendOperator = sendOperator;
    this.sendModified = sendModified;
    this.sendCreate = sendCreate;
  }

  public CarSend() {
  }
}
