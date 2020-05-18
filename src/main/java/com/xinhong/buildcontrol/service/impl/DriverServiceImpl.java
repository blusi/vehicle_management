package com.xinhong.buildcontrol.service.impl;

import com.xinhong.buildcontrol.mapper.DriverMapper;
import com.xinhong.buildcontrol.pojo.DriverInfo;
import com.xinhong.buildcontrol.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverMapper driverMapper;

    @Override
    public List<DriverInfo> getAllDriver() {
        return driverMapper.getAllDriver();
    }

    @Override
    public DriverInfo getDriverById(int id) {
        return driverMapper.getDriverById(id);
    }
}
