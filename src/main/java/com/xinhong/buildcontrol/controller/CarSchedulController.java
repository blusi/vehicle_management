package com.xinhong.buildcontrol.controller;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinhong.buildcontrol.pojo.CarRepairing;
import com.xinhong.buildcontrol.pojo.CarSchedul;
import com.xinhong.buildcontrol.service.CarRepairingService;
import com.xinhong.buildcontrol.service.CarSchedulService;
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

@Api(tags = "排班管理")
@RestController
@RequestMapping("car/carSchedul")
@CrossOrigin
public class CarSchedulController {

    @Autowired
    CarSchedulService carSchedulService;
    Result result = new Result();
    TimeUtils time = new TimeUtils();

    /**
     * 添加和修改
     * @param
     * @return
     */
    @ApiOperation(value = "排班新增或修改——可用",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "schedulId", value = "修改的时候传入", required = false,paramType = "query"),
            @ApiImplicitParam(name = "carId", value = "车辆id", required = true,paramType = "query"),
            @ApiImplicitParam(name = "schedulStatus", value = "状态：预约/未预约", required = true,paramType = "query"),
            @ApiImplicitParam(name = "schedulAppointmentInfo", value = "预约提示，预约时显示", required = true,paramType = "query"),
            @ApiImplicitParam(name = "schedulNotes", value = "备注", required = true,paramType = "query"),

    })
    @RequestMapping(value="/save",method= RequestMethod.GET)//测试所用GET
    public Result save( CarSchedul carSchedul){//@RequestBoy
        try{
            if(carSchedul.getSchedulId()!= null){
                carSchedul.setSchedulModified(time.getTime1());
                carSchedul.setSchedulOperator("初始值");
                carSchedulService.updateById(carSchedul);
            }else {
                String s = IdUtil.simpleUUID();
                carSchedul.setSchedulId(s);
                carSchedul.setSchedulCreate(time.getTime1());
                carSchedul.setSchedulOperator("初始值");
                carSchedulService.insert(carSchedul);
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
            CarSchedul pojo = new CarSchedul();
            pojo.setSchedulId(id);
            pojo.setIsDelete(1);
            carSchedulService.updateById(pojo);
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
            return result.success("成功",carSchedulService.selectById(id));
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
            EntityWrapper<CarSchedul> entityWrapper = new EntityWrapper<CarSchedul>();
            entityWrapper.and("is_delete=0");
            return result.success("成功",carSchedulService.selectList(entityWrapper));
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
            List<CarSchedul> carApplies = carSchedulService.selectList(null);
            PageInfo pageInfo = new PageInfo(carApplies);
            return result.success("成功",new DatagridResult(pageInfo.getTotal(), pageInfo.getList()));
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }

}
