package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarAsMapper;
import com.xinhong.buildcontrol.pojo.CarAs;
import com.xinhong.buildcontrol.service.CarAsService;
import org.springframework.stereotype.Service;

@Service
public class CarAsServiceImpl extends ServiceImpl<CarAsMapper, CarAs> implements CarAsService {
}
