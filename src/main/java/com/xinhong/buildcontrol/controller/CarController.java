package com.xinhong.buildcontrol.controller;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinhong.buildcontrol.pojo.Car;
import com.xinhong.buildcontrol.service.CarService;
import com.xinhong.buildcontrol.utils.DatagridResult;
import com.xinhong.buildcontrol.utils.Result;
import com.xinhong.buildcontrol.utils.TimeUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Api(tags = "汽车管理")
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;
    Result result = new Result();
    TimeUtils time = new TimeUtils();

    /**
     * 添加和修改
     * @param
     * @return
     */
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
    @RequestMapping(value="/save",method= RequestMethod.GET)//测试所用GET
    public Result save( Car car){//@RequestBoy
        try{
            if(car.getCarId()!= null){
                car.setCarModified(time.getTime1());
                car.setCarOperator("初始值");
                carService.updateById(car);
            }else {
                String s = IdUtil.simpleUUID();
                car.setCarId(s);
                car.setCarCreate(time.getTime1());
                car.setCarOperator("初始值");
                carService.insert(car);
            }
            return result.success();
        }catch (Exception e){
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }

    @ApiOperation(value = "删除——可用",httpMethod = "DELETE")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "删除，id必须传入", required = true,paramType = "query")
    })
    @RequestMapping(value="/{id}",method= RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id){
        try {
            Car pojo = new Car();
            pojo.setCarId(id);
            pojo.setIsDelete(1);
            carService.updateById(pojo);
            return result.success();
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }

    /**
     * 查询单个
     * @param id
     * @return
     */
    @ApiOperation(value = "用户查询单个——可用",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "单个查询，id必须传入", required = true,paramType = "query")
    })
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result get(@PathVariable("id")String id)
    {
        try {
            return result.success("成功",carService.selectById(id));
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }

    /**
     * 查看所有信息
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result list(){
        try {
            EntityWrapper<Car> entityWrapper = new EntityWrapper<Car>();
            entityWrapper.and("is_delete=0");
            return result.success("成功",carService.selectList(entityWrapper));
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }
    /**
     * 查看所有信息
     * @return
     */
    @ApiOperation(value = "分页查询——可用",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPage", value = "页数", required = true,paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "分页大小", required = true,paramType = "query")
    })
    @RequestMapping(value = "/listPage",method = RequestMethod.GET)
    public Result listPage(@RequestParam(defaultValue = "1") Integer currentPage, @RequestParam(defaultValue = "10") Integer pageSize){
        try {
            PageHelper.startPage(currentPage,pageSize);
            List<Car> carApplies = carService.selectList(null);
            PageInfo pageInfo = new PageInfo(carApplies);
            return result.success("成功",new DatagridResult(pageInfo.getTotal(), pageInfo.getList()));
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }

}



