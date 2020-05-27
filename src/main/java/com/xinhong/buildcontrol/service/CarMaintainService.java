package com.xinhong.buildcontrol.service;

import com.baomidou.mybatisplus.service.IService;
import com.xinhong.buildcontrol.dto.CarDTO;
import com.xinhong.buildcontrol.pojo.CarMaintain;

import java.util.List;

public interface CarMaintainService extends IService<CarMaintain> {
    List<CarDTO> getPro();
}
