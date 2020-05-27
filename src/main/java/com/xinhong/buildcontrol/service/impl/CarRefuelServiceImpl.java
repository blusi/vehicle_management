package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarRefuelMapper;
import com.xinhong.buildcontrol.pojo.CarRefuel;
import com.xinhong.buildcontrol.service.CarRefuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CarRefuelServiceImpl extends ServiceImpl<CarRefuelMapper, CarRefuel> implements CarRefuelService {

    @Autowired
    CarRefuelMapper carRefuelMapper;

    @Override
    public List<CarRefuel> getCarRefuel() {
        return carRefuelMapper.getCarRefuel();
    }

    @Override
    public List<CarRefuel> queryIt(HashMap hashMap) {
        return carRefuelMapper.queryIt(hashMap);
    }


}
