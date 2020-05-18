package com.xinhong.buildcontrol.service;

import com.xinhong.buildcontrol.pojo.DriverInfo;

import java.util.List;

public interface DriverService {

    List<DriverInfo> getAllDriver();

    DriverInfo getDriverById(int id);
}
