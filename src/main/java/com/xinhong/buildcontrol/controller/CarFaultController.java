package com.xinhong.buildcontrol.controller;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinhong.buildcontrol.pojo.CarFault;
import com.xinhong.buildcontrol.service.CarFaultService;
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

@Api(tags = "车辆故障管理")
@RestController
@RequestMapping("car/carFault")
@CrossOrigin
public class CarFaultController {

    @Autowired
    CarFaultService carFaultService;
    Result result = new Result();
    TimeUtils time = new TimeUtils();

    /**
     * 添加和修改
     * @param
     * @return
     */
    @ApiOperation(value = "故障新增或修改——可用",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "faultId", value = "修改的时候传入", required = false,paramType = "query"),
            @ApiImplicitParam(name = "carId", value = "车辆id", required = true,paramType = "query"),
            @ApiImplicitParam(name = "faultTime", value = "故障时间", required = true,paramType = "query"),
            @ApiImplicitParam(name = "faultSite", value = "故障地点", required = true,paramType = "query"),
            @ApiImplicitParam(name = "faultType", value = "故障类型", required = true,paramType = "query"),
            @ApiImplicitParam(name = "faultStatus", value = "状态", required = true,paramType = "query"),
            @ApiImplicitParam(name = "faultNotes", value = "备注", required = true,paramType = "query"),
    })
    @RequestMapping(value="/save",method= RequestMethod.GET)//测试所用GET
    public Result save( CarFault carFault){//@RequestBoy
        try{
            if(carFault.getFaultId()!= null){
                carFault.setFaultModified(time.getTime1());
                carFault.setFaultOperator("初始值");
                carFaultService.updateById(carFault);
            }else {
                String s = IdUtil.simpleUUID();
                carFault.setFaultId(s);
                carFault.setFaultCreate(time.getTime1());
                carFault.setFaultOperator("初始值");
                carFaultService.insert(carFault);
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
            CarFault pojo = new CarFault();
            pojo.setFaultId(id);
            pojo.setIsDelete(1);
            carFaultService.updateById(pojo);
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
            return result.success("成功",carFaultService.selectById(id));
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
            EntityWrapper<CarFault> entityWrapper = new EntityWrapper<CarFault>();
            entityWrapper.and("is_delete=0");
            return result.success("成功",carFaultService.selectList(entityWrapper));
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
            List<CarFault> carApplies = carFaultService.selectList(null);
            PageInfo pageInfo = new PageInfo(carApplies);
            return result.success("成功",new DatagridResult(pageInfo.getTotal(), pageInfo.getList()));
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }


}
