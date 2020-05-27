package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.dto.CarDTO;
import com.xinhong.buildcontrol.mapper.CarMaintainMapper;
import com.xinhong.buildcontrol.pojo.CarMaintain;
import com.xinhong.buildcontrol.service.CarMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarMaintainServiceImpl extends ServiceImpl<CarMaintainMapper, CarMaintain> implements CarMaintainService {

    @Autowired
    CarMaintainMapper carMaintainMapper;

    @Override
    public List<CarDTO> getPro() {
        return carMaintainMapper.getPro();
    }
}
