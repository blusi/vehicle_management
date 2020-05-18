package com.xinhong.buildcontrol.service;

import com.xinhong.buildcontrol.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    List<Employee> selectPageList(Integer currentPage, Integer pageSize, String startTime, String endTime, Integer state);

    int insertEmployee(Employee employee);

}
