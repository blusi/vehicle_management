package com.xinhong.buildcontrol.mapper;

import com.xinhong.buildcontrol.pojo.Employee;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
public interface EmployeeMapper {

    List<Employee> getAllEmployee();//查找

    List<Employee> getListEmployee(Integer currentPage, Integer pageSize, String startTime, String endTime, Integer state);

    int insertEmployee(Employee employee);//添加

    int updateById(Employee employee);//修改

    int deleteById(Employee employee);//删除



}
