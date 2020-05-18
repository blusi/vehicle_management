package com.xinhong.buildcontrol.controller;

import com.xinhong.buildcontrol.pojo.Car;
import com.xinhong.buildcontrol.pojo.Employee;
import com.xinhong.buildcontrol.service.impl.EmployeeServiceImpl;
import com.xinhong.buildcontrol.utils.Result;
import com.xinhong.buildcontrol.utils.TimeUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    Result result = new Result();

    TimeUtils time = new TimeUtils();

    /**
     * 查看所有员工
     * @return
     */
    @RequestMapping("/getEmployee")
    public Result getAllEmployee(){
        return result.success("成功",employeeService.getAllEmployee());
    }

    @ApiOperation(value = "查看列表", httpMethod = "GET")
    @RequestMapping(value = "/listEmployee", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPage", value = "页码", required = true, paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "分页大小", required = true, paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "开始时间", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结束时间", paramType = "query"),
            @ApiImplicitParam(name = "state", value = "状态", paramType = "query"),
    })
    public Result listPage(@RequestParam(defaultValue = "1") Integer currentPage, @RequestParam(defaultValue = "10") Integer pageSize
            , String startTime, String endTime, @RequestParam(defaultValue = "0") Integer state) {


        List<Employee> assetBaseVoDatagridResult = employeeService.selectPageList(currentPage, pageSize, startTime, endTime, state);
        return result.success("成功", assetBaseVoDatagridResult);

    }

    @RequestMapping("/insert")
    public Result insertEmployee(Employee employee){
        Employee employee1 = new Employee();
        employee1.setEmployeeName("龙傲天");
        employee1.setEmployeeAge(25);
        employee1.setEmployeeSex("男");
        employee1.setEmployeeBirthday("1997-10-11");
        employee1.setEmployeeAddress("上海市");
        employee1.setEmployeeIdCard("1111111111111111111");
        employee1.setEmployeePhone(1888688885);
        employee1.setEmployeeDepartment("研发部");
        employee1.setEmployeeWorkingYears(4);
        employee1.setEmployeeCreate(time.getTime1());
        employee1.setEmployeeOperator("admin");
        int i = employeeService.insertEmployee(employee1);
        return result.success("yes",i);
    }


}
