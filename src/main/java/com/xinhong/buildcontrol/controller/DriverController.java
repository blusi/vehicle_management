package com.xinhong.buildcontrol.controller;


import com.xinhong.buildcontrol.service.impl.DriverServiceImpl;
import com.xinhong.buildcontrol.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    DriverServiceImpl driverService;

    Result result = new Result();


    @RequestMapping("/getAll")
    public Result getAllDriver(){
        return result.success("yes",driverService.getAllDriver());
    }

    @RequestMapping("/getDriver/{id}")
    public Result  getDriverById(@PathVariable("id") int id){
        return result.success("yes",driverService.getDriverById(id));
    }

}
