package com.xinhong.buildcontrol.controller;

import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinhong.buildcontrol.mapper.CarMapper;
import com.xinhong.buildcontrol.pojo.Car;
import com.xinhong.buildcontrol.pojo.Test1;
import com.xinhong.buildcontrol.service.impl.CarServiceImpl;
import com.xinhong.buildcontrol.utils.IdWorker;
import com.xinhong.buildcontrol.utils.Result;
import com.xinhong.buildcontrol.utils.TimeUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;


import java.net.InetAddress;
import java.net.UnknownHostException;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;


@Api(tags = "汽车管理")
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarServiceImpl carService;
    private TimeUtils time = new TimeUtils();
    private Result result = new Result();

    /**
     * 分页查看车辆
     * @param currentPage
     * @param pageSize
     * @param startTime
     * @param endTime
     * @param state
     * @return
     */
    @ApiOperation(value = "查看列表", httpMethod = "GET")
        @RequestMapping(value = "/listPage", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPage", value = "页码", required = true, paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "分页大小", required = true, paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "开始时间", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结束时间", paramType = "query"),
            @ApiImplicitParam(name = "state", value = "状态", paramType = "query"),
    })
    public Result listPage(@RequestParam(defaultValue = "1") Integer currentPage, @RequestParam(defaultValue = "10") Integer pageSize
            , String startTime, String endTime, @RequestParam(defaultValue = "0") Integer state) {

        Result result = new Result() ;
            List<Car> assetBaseVoDatagridResult = carService.selectPageList(currentPage, pageSize, startTime, endTime, state);
            return result.success("成功", assetBaseVoDatagridResult);

    }

    /**
     * 根据id查找车辆
     * @param id
     * @return
     */
    @RequestMapping(value="/getCar/{id}",method = RequestMethod.GET)
    public Result getCar(@PathVariable("id") int id){
        Result result = new Result();
        Car car = carService.getCarById(id);
        return result.success("成功",car);
    }

    /**
     * 添加车辆
     * @param car
     * @return
     */
    @RequestMapping(value="/insertCar",method = RequestMethod.GET)
    public int insertCar(Car car){

        Result result = new Result();
        if(car != null){
            Car car1 = new Car();
            car1.setCarName(car.getCarName());
            car1.setCarBrand(car.getCarBrand());
            car1.setCarNumber(car.getCarNumber());
            car1.setCarType(car.getCarType());
            car1.setCarStatus(car.getCarStatus());
            car1.setCarAge(car.getCarAge());
            car1.setCarDepartment(car.getCarDepartment());
            car1.setCarPossessor(car.getCarPossessor());
            car1.setCarEngineNumber(car.getCarEngineNumber());
            car1.setCarFunction(car.getCarFunction());
            car1.setCarVin(car.getCarVin());
            car1.setCarRegistrationDate(time.getTime2());
            car1.setCarLicenceIssued(time.getTime2());
            car1.setCarCreate(time.getTime1());
            InetAddress addr = null;
            try {
                addr = InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
            String name=addr.getHostName().toString();
            car1.setCarOperator("name");
            int i = carService.insertCar(car1);
            System.out.println(time);
            return i;
        }

        return 0;
    }

    /**
     * 修改汽车
     * @param car
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result updateById( Car car){
        Result result = new Result();
        Car car1 = new Car();//模拟数据
        car1.setCarId("15");
        car1.setCarName("S级");
        car1.setCarBrand("奔驰");
        car1.setCarNumber("贵A2344");
        car1.setCarType("豪车");
        car1.setCarStatus("已预约");
        car1.setCarAge(2);
        car1.setCarDepartment("财务部");
        car1.setCarPossessor("小王");
        car1.setCarEngineNumber("32435rwsw3");
        car1.setCarFunction("非运营");
        car1.setCarVin("234234");
        car1.setCarRegistrationDate(time.getTime2());
        car1.setCarLicenceIssued(time.getTime2());
        car1.setCarModified(time.getTime1());
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String name=addr.getHostName().toString();
        car1.setCarOperator("name");
        carService.updateById(car1);
        return result.success("cg",car1);
    }

    /**
     * 练习pageHelper
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result list(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,3);
        List<Car> cars = carService.getAll();
        PageInfo pageInfo = new PageInfo(cars,3);
        return result.success("yes",pageInfo);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @ApiOperation(value = "删除" ,httpMethod = "DELETE")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id",value = "id,必须值",required = true,paramType = "query")
    })
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable("id") int id){
        int i = carService.deleteById(id);
        return result.success("yes",i);
    }


    @ApiOperation(value = "汽车新增或修改--可用",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "carId", value = "修改时传入", required = false, paramType = "query"),
            @ApiImplicitParam(name = "carNumber",value = "车牌号",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carBrand",value = "品牌",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carName",value = "名字",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carType",value = "类型",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carStatus",value = "状态",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carAge",value = "车龄",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carDepartment",value = "所属部门",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carPossessor",value = "所属人",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carEngineNumber",value = "发动机号",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carFunction",value = "使用性质",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carVin",value = "车架号",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carRegistrationDate",value = "注册日期",required = true, paramType = "query"),
            @ApiImplicitParam(name = "carLicenceIssued",value = "领证日期",required = true, paramType = "query"),
    })
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public Result save( Car car){
        try {
            if(!(car.getCarId() == null)){
                car.setCarModified(time.getTime1());
                car.setCarOperator("初始值");
                carService.updateById(car);
            }else {
                String s = IdUtil.simpleUUID();
                car.setCarId(s);
                car.setCarCreate(time.getTime1());
                car.setCarOperator("初始值");
                carService.insertCar(car);
            }
            return result.success();
        }catch (Exception e){
            e.printStackTrace();
            return result.fail(e.getMessage());
        }

    }



    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Result test(@RequestBody Test1 test1){
        int i = carService.insertTest(test1);
        return result.success("yes",i );
    }
}
