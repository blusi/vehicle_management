package com.xinhong.buildcontrol.service;

import com.baomidou.mybatisplus.service.IService;
import com.xinhong.buildcontrol.pojo.CarRefuel;

import java.util.HashMap;
import java.util.List;

public interface CarRefuelService extends IService<CarRefuel> {
    List<CarRefuel> getCarRefuel();

    List<CarRefuel> queryIt(HashMap hashMap);
}
