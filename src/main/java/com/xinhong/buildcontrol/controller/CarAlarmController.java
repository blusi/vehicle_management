package com.xinhong.buildcontrol.controller;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinhong.buildcontrol.pojo.CarAccident;
import com.xinhong.buildcontrol.pojo.CarAlarm;
import com.xinhong.buildcontrol.service.CarAccidentService;
import com.xinhong.buildcontrol.service.CarAlarmService;
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

@Api(tags = "警报管理")
@RestController
@RequestMapping("car/carAlarm")
@CrossOrigin
public class CarAlarmController {

    @Autowired
    CarAlarmService carAlarmService;
    Result result = new Result();
    TimeUtils time = new TimeUtils();

    /**
     * 添加和修改
     * @param  carAlarm
     * @return
     */
    @ApiOperation(value = "警报新增或修改——可用",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "alarmId", value = "修改的时候传入", required = false,paramType = "query"),
            @ApiImplicitParam(name = "alarmTime", value = "警报时间", required = true,paramType = "query"),
            @ApiImplicitParam(name = "alarmInfo", value = "警报信息", required = true,paramType = "query"),
            @ApiImplicitParam(name = "carId", value = "车辆ID", required = true,paramType = "query"),
    })
    @RequestMapping(value="/save",method= RequestMethod.GET)
    public Result save( CarAlarm carAlarm){
        try{
            if(carAlarm.getAlarmId()!= null){
                carAlarm.setAlarmModified(time.getTime1());
                carAlarm.setAlarmOperator("初始值");
                carAlarmService.updateById(carAlarm);
            }else {
                String s = IdUtil.simpleUUID();
                carAlarm.setAlarmId(s);
                carAlarm.setAlarmCreate(time.getTime1());
                carAlarm.setAlarmOperator("初始值");
                carAlarmService.insert(carAlarm);
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
            CarAlarm pojo = new CarAlarm();
            pojo.setAlarmId(id);
            pojo.setIsDelete(1);
            carAlarmService.updateById(pojo);
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
            return result.success("成功",carAlarmService.selectById(id));
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
            EntityWrapper<CarAlarm> entityWrapper = new EntityWrapper<CarAlarm>();
            entityWrapper.and("is_delete=0");
            return result.success("成功",carAlarmService.selectList(entityWrapper));
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
            List<CarAlarm> carAlarms = carAlarmService.selectList(null);
            PageInfo pageInfo = new PageInfo(carAlarms);
            return result.success("成功",new DatagridResult(pageInfo.getTotal(), pageInfo.getList()));
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }
}
