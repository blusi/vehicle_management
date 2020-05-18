package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarMaintainMapper;
import com.xinhong.buildcontrol.pojo.CarMaintain;
import com.xinhong.buildcontrol.service.CarMaintainService;
import org.springframework.stereotype.Service;

@Service
public class CarMaintainServiceImpl extends ServiceImpl<CarMaintainMapper, CarMaintain> implements CarMaintainService {
}
