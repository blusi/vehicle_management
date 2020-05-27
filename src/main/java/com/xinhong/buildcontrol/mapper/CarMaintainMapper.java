package com.xinhong.buildcontrol.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xinhong.buildcontrol.dto.CarDTO;
import com.xinhong.buildcontrol.pojo.CarMaintain;

import java.util.List;

public interface CarMaintainMapper extends BaseMapper<CarMaintain> {


    List<CarDTO> getPro();

}
