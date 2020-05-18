package com.xinhong.buildcontrol.service.impl;

import com.xinhong.buildcontrol.mapper.EmployeeMapper;
import com.xinhong.buildcontrol.pojo.Employee;
import com.xinhong.buildcontrol.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> allEmployee = employeeMapper.getAllEmployee();
        return allEmployee;
    }

    @Override
    public List<Employee> selectPageList(Integer currentPage, Integer pageSize, String startTime, String endTime, Integer state) {
        return employeeMapper.getListEmployee(currentPage,pageSize,startTime,endTime,state);
    }

    @Override
    public int insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }
}
