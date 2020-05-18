package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarAlarmMapper;
import com.xinhong.buildcontrol.pojo.CarAlarm;
import com.xinhong.buildcontrol.service.CarAlarmService;
import org.springframework.stereotype.Service;

@Service
public class CarAlarmServiceImpl extends ServiceImpl<CarAlarmMapper, CarAlarm> implements CarAlarmService {
}
