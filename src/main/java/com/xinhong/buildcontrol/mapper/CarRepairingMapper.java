package com.xinhong.buildcontrol.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xinhong.buildcontrol.dto.CarDTO;
import com.xinhong.buildcontrol.pojo.CarRepairing;

import java.util.List;

public interface CarRepairingMapper extends BaseMapper<CarRepairing> {

    List<CarDTO> getPro();


}
