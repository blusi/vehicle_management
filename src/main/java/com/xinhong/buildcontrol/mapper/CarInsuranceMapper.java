package com.xinhong.buildcontrol.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xinhong.buildcontrol.pojo.CarInsurance;
import org.apache.ibatis.annotations.Select;

public interface CarInsuranceMapper extends BaseMapper<CarInsurance> {

//    @Select("select  to_days('#{time}')- to_days(now())")
//    String getRemain(String time);

}
