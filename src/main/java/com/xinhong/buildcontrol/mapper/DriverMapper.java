package com.xinhong.buildcontrol.mapper;

import com.xinhong.buildcontrol.pojo.DriverInfo;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
public interface DriverMapper {

    List<DriverInfo> getAllDriver();

    DriverInfo getDriverById(int id);

}
