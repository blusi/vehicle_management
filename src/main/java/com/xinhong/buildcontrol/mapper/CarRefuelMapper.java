package com.xinhong.buildcontrol.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xinhong.buildcontrol.pojo.CarRefuel;

import java.util.HashMap;
import java.util.List;

public interface CarRefuelMapper extends BaseMapper<CarRefuel> {

    List<CarRefuel> getCarRefuel();

    List<CarRefuel> queryIt(HashMap hashMap);
}
