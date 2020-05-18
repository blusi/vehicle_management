package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarFaultMapper;
import com.xinhong.buildcontrol.pojo.CarFault;
import com.xinhong.buildcontrol.service.CarFaultService;
import org.springframework.stereotype.Service;

@Service
public class CarFaultServiceImpl extends ServiceImpl<CarFaultMapper, CarFault> implements CarFaultService {
}
