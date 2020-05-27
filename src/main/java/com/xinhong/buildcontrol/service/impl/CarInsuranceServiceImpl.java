package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarInsuranceMapper;
import com.xinhong.buildcontrol.pojo.CarInsurance;
import com.xinhong.buildcontrol.service.CarInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarInsuranceServiceImpl extends ServiceImpl<CarInsuranceMapper, CarInsurance> implements CarInsuranceService {

//    @Autowired
//    CarInsuranceMapper carInsuranceMapper;
//
//    @Override
//    public String getRemain(String time) {
//        return carInsuranceMapper.getRemain(time);
//    }
}
