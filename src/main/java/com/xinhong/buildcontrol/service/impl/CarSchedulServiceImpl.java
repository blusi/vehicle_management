package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarSchedulMapper;
import com.xinhong.buildcontrol.pojo.CarSchedul;
import com.xinhong.buildcontrol.service.CarSchedulService;
import org.springframework.stereotype.Service;

@Service
public class CarSchedulServiceImpl extends ServiceImpl<CarSchedulMapper, CarSchedul> implements CarSchedulService {
}
