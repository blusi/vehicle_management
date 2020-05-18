package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarApplyMapper;
import com.xinhong.buildcontrol.pojo.CarApply;
import com.xinhong.buildcontrol.service.CarApplyService;
import org.springframework.stereotype.Service;

@Service
public class CarApplyServiceImpl extends ServiceImpl<CarApplyMapper, CarApply> implements CarApplyService {
}
