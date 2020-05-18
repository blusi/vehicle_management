package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarRefuelMapper;
import com.xinhong.buildcontrol.pojo.CarRefuel;
import com.xinhong.buildcontrol.service.CarRefuelService;
import org.springframework.stereotype.Service;

@Service
public class CarRefuelServiceImpl extends ServiceImpl<CarRefuelMapper, CarRefuel> implements CarRefuelService {
}
