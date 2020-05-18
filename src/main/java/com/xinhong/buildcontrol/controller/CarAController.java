package com.xinhong.buildcontrol.controller;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinhong.buildcontrol.pojo.CarAccident;
import com.xinhong.buildcontrol.service.CarAccidentService;
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

@Api(tags = "事故管理")
@RestController
@RequestMapping("Car/CarAccident")
@CrossOrigin
public class CarAController {

    @Autowired
    CarAccidentService carAccidentService;
    Result result = new Result();
    TimeUtils time = new TimeUtils();

    /**
     * 添加和修改
     * @param carAccident
     * @return
     */
    @ApiOperation(value = "事故新增或修改——可用",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "accidentId", value = "修改的时候传入", required = false,paramType = "query"),
            @ApiImplicitParam(name = "accidentTime", value = "事故时间", required = true,paramType = "query"),
            @ApiImplicitParam(name = "accidentSite", value = "事故地点", required = true,paramType = "query"),
            @ApiImplicitParam(name = "accidentType", value = "事故类型", required = true,paramType = "query"),
            @ApiImplicitParam(name = "accidentStatus", value = "事故状态", required = true,paramType = "query"),
            @ApiImplicitParam(name = "accidentNotes", value = "事故备注", required = true,paramType = "query")
    })
    @RequestMapping(value="/save",method= RequestMethod.GET)
    public Result save( CarAccident carAccident){
        try{
            if(carAccident.getAccidentId() != null){
                carAccident.setAccidentModified(time.getTime1());
                carAccident.setAccidentOperator("初始值");
                carAccidentService.updateById(carAccident);
            }else {
                String s = IdUtil.simpleUUID();
                carAccident.setAccidentId(s);
                carAccident.setAccidentCreate(time.getTime1());
                carAccident.setAccidentOperator("初始值");
                carAccidentService.insert(carAccident);
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
            CarAccident pojo = new CarAccident();
            pojo.setAccidentId(id);
            pojo.setIsDelete(1);
            carAccidentService.updateById(pojo);
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
            return result.success("成功",carAccidentService.selectById(id));
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
            EntityWrapper<CarAccident> entityWrapper = new EntityWrapper<CarAccident>();
            entityWrapper.and("is_delete=0");
            return result.success("成功",carAccidentService.selectList(entityWrapper));
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
            List<CarAccident> carAccidents = carAccidentService.selectList(null);
            PageInfo pageInfo = new PageInfo(carAccidents);
            return result.success("成功",new DatagridResult(pageInfo.getTotal(), pageInfo.getList()));
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }
}
