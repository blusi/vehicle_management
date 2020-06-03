package com.xinhong.buildcontrol.service;

import com.baomidou.mybatisplus.service.IService;
import com.xinhong.buildcontrol.dto.CarDTO;
import com.xinhong.buildcontrol.pojo.CarRepairing;

import java.util.List;

public interface CarRepairingService extends IService<CarRepairing> {
    List<CarDTO> getPro();
}
