package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarMaintainProMapper;
import com.xinhong.buildcontrol.pojo.CarMaintainProject;
import com.xinhong.buildcontrol.service.CarMaintainProService;
import org.springframework.stereotype.Service;

@Service
public class CarMaintainProServiceImpl extends ServiceImpl<CarMaintainProMapper, CarMaintainProject> implements CarMaintainProService {
}
