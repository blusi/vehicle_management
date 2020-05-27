package com.xinhong.buildcontrol.controller;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinhong.buildcontrol.pojo.CarMaintain;
import com.xinhong.buildcontrol.pojo.CarMaintainProject;
import com.xinhong.buildcontrol.service.CarMaintainProService;
import com.xinhong.buildcontrol.service.CarMaintainService;
import com.xinhong.buildcontrol.utils.DatagridResult;
import com.xinhong.buildcontrol.utils.Result;
import com.xinhong.buildcontrol.utils.TimeUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "保养管理")
@RestController
@RequestMapping("car/carMaintain")
@CrossOrigin
public class CarMaintainController {

    @Autowired
    CarMaintainService carMaintainService;
    @Autowired
    CarMaintainProService carMaintainProService;
    Result result = new Result();
    TimeUtils time = new TimeUtils();

    /**
     * 添加和修改
     * @param
     * @return
     */
    @ApiOperation(value = "保养新增或修改——可用",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "maintainId", value = "修改的时候传入", required = false,paramType = "query"),
            @ApiImplicitParam(name = "carId", value = "车辆id", required = true,paramType = "query"),
            @ApiImplicitParam(name = "maintainPlace", value = "地点", required = true,paramType = "query"),
            @ApiImplicitParam(name = "maintainThisTime", value = "本次保养日期", required = true,paramType = "query"),
            @ApiImplicitParam(name = "maintainThisKm", value = "本次保养里程", required = true,paramType = "query"),
            @ApiImplicitParam(name = "maintainNextTime", value = "下次保养日期", required = true,paramType = "query"),
            @ApiImplicitParam(name = "maintainNextKm", value = "下次保养里程", required = true,paramType = "query"),
            @ApiImplicitParam(name = "maintainProject", value = "保养项目", required = true,paramType = "query"),
            @ApiImplicitParam(name = "maintainCost", value = "花费", required = true,paramType = "query"),
            @ApiImplicitParam(name = "maintainReceipts", value = "单据", required = true,paramType = "query"),
            @ApiImplicitParam(name = "maintainNotes", value = "备注", required = true,paramType = "query")
    })
    @RequestMapping(value="/save",method= RequestMethod.GET)//测试所用GET
    public Result save( CarMaintain carMaintain){//@RequestBoy
        try{
            if(carMaintain.getMaintainId()!= null){
                carMaintain.setMaintainModified(time.getTime1());
                carMaintain.setMaintainOperator("初始值");
                carMaintainService.updateById(carMaintain);
            }else {
                String s = IdUtil.simpleUUID();
                carMaintain.setMaintainId(s);
                carMaintain.setMaintainCreate(time.getTime1());
                carMaintain.setMaintainOperator("初始值");
                carMaintainService.insert(carMaintain);
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
            CarMaintain pojo = new CarMaintain();
            pojo.setMaintainId(id);
            pojo.setIsDelete(1);
            carMaintainService.updateById(pojo);
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
            return result.success("成功",carMaintainService.selectById(id));
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
            EntityWrapper<CarMaintain> entityWrapper = new EntityWrapper<CarMaintain>();
            entityWrapper.and("is_delete=0");
            return result.success("成功",carMaintainService.selectList(entityWrapper));
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
            List<CarMaintain> carApplies = carMaintainService.selectList(null);
            PageInfo pageInfo = new PageInfo(carApplies);
            return result.success("成功",new DatagridResult(pageInfo.getTotal(), pageInfo.getList()));
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }

    /**
     * 得到保养信息和保养项目
     * @return
     */
    @RequestMapping("/getPro")
    public Result getPro(){
        return result.success("ok",carMaintainService.getPro());
    }

    @RequestMapping("/insert")
    public Result insertMaintain(CarMaintain carMaintain){
        if(carMaintain.getMaintainId() == null){
            int a = 0;//保养总花费
            String s = IdUtil.simpleUUID();

            //添加项目
            List<CarMaintainProject> carMaintainProject = new ArrayList<>();
            //carMaintainProject.size()
            for (int i = 0;i<=3;i++){
                CarMaintainProject carMaintainProject1 = new CarMaintainProject();
                String s1 = IdUtil.simpleUUID();
                carMaintainProject1.setMaintainId(s);
                carMaintainProject1.setProId(s1);
                carMaintainProject1.setProName("玻璃水");
                carMaintainProject1.setCost(200);
                carMaintainProject1.setProCreate(time.getTime1());
                a= (int) (a+carMaintainProject1.getCost());
               //    carMaintainProService.insert(carMaintainProject1);
                carMaintainProject.add(carMaintainProject1);
            }
            carMaintainProService.insertBatch(carMaintainProject);

           //添加保养信息
            carMaintain.setMaintainId(s);
            carMaintain.setMaintainCreate(time.getTime1());
            carMaintain.setMaintainOperator("初始值");
            carMaintain.setMaintainCost(a);
            carMaintainService.insert(carMaintain);


        }
        return result.success("ok");
    }
}
