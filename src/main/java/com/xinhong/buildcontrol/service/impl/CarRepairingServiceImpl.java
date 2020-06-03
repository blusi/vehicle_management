package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.dto.CarDTO;
import com.xinhong.buildcontrol.mapper.CarRepairingMapper;
import com.xinhong.buildcontrol.pojo.CarRepairing;
import com.xinhong.buildcontrol.service.CarRepairingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarRepairingServiceImpl extends ServiceImpl<CarRepairingMapper, CarRepairing> implements CarRepairingService {

    @Autowired
    CarRepairingMapper carRepairingMapper;


    @Override
    public List<CarDTO> getPro() {
        return carRepairingMapper.getPro();
    }
}
