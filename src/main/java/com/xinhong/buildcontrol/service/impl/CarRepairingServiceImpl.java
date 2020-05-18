package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarRepairingMapper;
import com.xinhong.buildcontrol.pojo.CarRepairing;
import com.xinhong.buildcontrol.service.CarRepairingService;
import org.springframework.stereotype.Service;

@Service
public class CarRepairingServiceImpl extends ServiceImpl<CarRepairingMapper, CarRepairing> implements CarRepairingService {
}
