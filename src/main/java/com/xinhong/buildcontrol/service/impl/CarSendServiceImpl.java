package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarSendMapper;
import com.xinhong.buildcontrol.pojo.CarSend;
import com.xinhong.buildcontrol.service.CarSendService;
import org.springframework.stereotype.Service;

@Service
public class CarSendServiceImpl extends ServiceImpl<CarSendMapper, CarSend> implements CarSendService {
}
