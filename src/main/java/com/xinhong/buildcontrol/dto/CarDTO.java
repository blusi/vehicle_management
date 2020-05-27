package com.xinhong.buildcontrol.dto;

import com.baomidou.mybatisplus.annotations.TableId;
import com.xinhong.buildcontrol.pojo.CarMaintain;
import lombok.Data;

import java.util.List;

/**
 * 汽车保养DTO
 */
@Data
public class CarDTO {
    @TableId
    private String carId;
    private String carNumber;
    private String carBrand;
    private String carName;
    private String carType;
    private String carStatus;
    private int carAge;
    private String carDepartment;
    private String carPossessor;
    private String carEngineNumber;
    private String carFunction;
    private String carVin;
    private String carRegistrationDate;
    private String carLicenceIssued;
    private String carOperator;
    private String carModified;
    private String carCreate;
    private int isDelete;

    //一个汽车对应多个保养
    private List<CarMaintain> carMaintain;

    public List<CarMaintain> getCarMaintain() {
        return carMaintain;
    }

    public void setCarMaintain(List<CarMaintain> carMaintain) {
        this.carMaintain = carMaintain;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getCarDepartment() {
        return carDepartment;
    }

    public void setCarDepartment(String carDepartment) {
        this.carDepartment = carDepartment;
    }

    public String getCarPossessor() {
        return carPossessor;
    }

    public void setCarPossessor(String carPossessor) {
        this.carPossessor = carPossessor;
    }

    public String getCarEngineNumber() {
        return carEngineNumber;
    }

    public void setCarEngineNumber(String carEngineNumber) {
        this.carEngineNumber = carEngineNumber;
    }

    public String getCarFunction() {
        return carFunction;
    }

    public void setCarFunction(String carFunction) {
        this.carFunction = carFunction;
    }

    public String getCarVin() {
        return carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    public String getCarRegistrationDate() {
        return carRegistrationDate;
    }

    public void setCarRegistrationDate(String carRegistrationDate) {
        this.carRegistrationDate = carRegistrationDate;
    }

    public String getCarLicenceIssued() {
        return carLicenceIssued;
    }

    public void setCarLicenceIssued(String carLicenceIssued) {
        this.carLicenceIssued = carLicenceIssued;
    }

    public String getCarOperator() {
        return carOperator;
    }

    public void setCarOperator(String carOperator) {
        this.carOperator = carOperator;
    }

    public String getCarModified() {
        return carModified;
    }

    public void setCarModified(String carModified) {
        this.carModified = carModified;
    }

    public String getCarCreate() {
        return carCreate;
    }

    public void setCarCreate(String carCreate) {
        this.carCreate = carCreate;
    }
}
