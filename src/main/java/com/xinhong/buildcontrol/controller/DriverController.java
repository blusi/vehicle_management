package com.xinhong.buildcontrol.controller;


import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinhong.buildcontrol.pojo.CarSend;
import com.xinhong.buildcontrol.pojo.DriverInfo;
import com.xinhong.buildcontrol.service.CarSendService;
import com.xinhong.buildcontrol.service.DriverService;
import com.xinhong.buildcontrol.service.impl.DriverServiceImpl;
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

@Api(tags = "司机管理")
@RestController
@RequestMapping("/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    DriverService driverService;
    Result result = new Result();
    TimeUtils time = new TimeUtils();

    /**
     * 添加和修改
     * @param
     * @return
     */
    @ApiOperation(value = "司机新增或修改——可用",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "driverId", value = "司机id", required = false,paramType = "query"),
            @ApiImplicitParam(name = "employeeId", value = "员工id", required = true,paramType = "query"),
            @ApiImplicitParam(name = "driverDrivingLicense", value = "驾照", required = true,paramType = "query"),
            @ApiImplicitParam(name = "driverIssueDate", value = "拿证日期", required = true,paramType = "query"),
            @ApiImplicitParam(name = "driverStatus", value = "忙闲", required = true,paramType = "query"),

    })
    @RequestMapping(value="/save",method= RequestMethod.GET)//测试所用GET
    public Result save( DriverInfo driverInfo){//@RequestBoy
        try{
            if(driverInfo.getDriverId()!= null){
                driverInfo.setDriverModified(time.getTime1());
                driverInfo.setDriverOperator("初始值");
                driverService.updateById(driverInfo);
            }else {
                String s = IdUtil.simpleUUID();
                driverInfo.setDriverId(s);
                driverInfo.setDriverCreate(time.getTime1());
                driverInfo.setDriverOperator("初始值");
                driverService.insert(driverInfo);
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
            DriverInfo pojo = new DriverInfo();
            pojo.setDriverId(id);
            pojo.setIsDelete(1);
            driverService.updateById(pojo);
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
            return result.success("成功",driverService.selectById(id));
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
            EntityWrapper<DriverInfo> entityWrapper = new EntityWrapper<DriverInfo>();
            entityWrapper.and("is_delete=0");
            return result.success("成功",driverService.selectList(entityWrapper));
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
            List<DriverInfo> carApplies = driverService.selectList(null);
            PageInfo pageInfo = new PageInfo(carApplies);
            return result.success("成功",new DatagridResult(pageInfo.getTotal(), pageInfo.getList()));
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }


}
