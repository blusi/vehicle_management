package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarAccidentMapper;
import com.xinhong.buildcontrol.pojo.CarAccident;
import com.xinhong.buildcontrol.service.CarAccidentService;
import org.springframework.stereotype.Service;

@Service
public class CarAccidentServiceImpl extends ServiceImpl<CarAccidentMapper, CarAccident> implements CarAccidentService {
}
