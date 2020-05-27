package com.xinhong.buildcontrol.controller;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xinhong.buildcontrol.pojo.CarRefuel;
import com.xinhong.buildcontrol.service.CarRefuelService;
import com.xinhong.buildcontrol.utils.DatagridResult;
import com.xinhong.buildcontrol.utils.Result;
import com.xinhong.buildcontrol.utils.TimeUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;

@Api(tags = "加油管理")
@RestController
@RequestMapping("car/carRefuel")
@CrossOrigin
public class CarRefuelController {

    @Autowired
    CarRefuelService carRefuelService;
    Result result = new Result();
    TimeUtils time = new TimeUtils();

    /**
     * 添加和修改
     * @param
     * @return
     */
    @ApiOperation(value = "加油新增或修改——可用",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "refuelId", value = "修改的时候传入", required = false,paramType = "query"),
            @ApiImplicitParam(name = "carId", value = "车辆id", required = true,paramType = "query"),
            @ApiImplicitParam(name = "refuelTime", value = "时间", required = true,paramType = "query"),
            @ApiImplicitParam(name = "refuelCost", value = "花费", required = true,paramType = "query"),
            @ApiImplicitParam(name = "refuelGasolineNumber", value = "油号", required = true,paramType = "query"),
            @ApiImplicitParam(name = "refuelPrice", value = "油价", required = true,paramType = "query"),
            @ApiImplicitParam(name = "refuelQuantity", value = "油量", required = true,paramType = "query"),
            @ApiImplicitParam(name = "refuelStation", value = "加油站", required = true,paramType = "query"),
            @ApiImplicitParam(name = "refuelPresentMileage", value = "仪表盘里程", required = true,paramType = "query"),
            @ApiImplicitParam(name = "refuelRemainMileage", value = "剩余里程", required = true,paramType = "query"),
            @ApiImplicitParam(name = "refuelNotes", value = "备注", required = true,paramType = "query"),
            @ApiImplicitParam(name = "refuelDocumentsInfo", value = "单据信息", required = true,paramType = "query")
    })
    @RequestMapping(value="/save",method= RequestMethod.GET)//测试所用GET
    public Result save( CarRefuel carRefuel){//@RequestBoy
        try{
            if(carRefuel.getRefuelId()!= null){
                carRefuel.setRefuelModified(time.getTime1());
                carRefuel.setRefuelOperator("初始值");
                carRefuelService.updateById(carRefuel);
            }else {
                String s = IdUtil.simpleUUID();
                carRefuel.setRefuelId(s);
                double f1 = new BigDecimal((float)carRefuel.getRefuelCost() / carRefuel.getRefuelPrice())
                        .setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();//保留小数点后两位
                carRefuel.setRefuelQuantity(f1);
                carRefuel.setRefuelCreate(time.getTime1());
                carRefuel.setRefuelOperator("初始值");
                carRefuelService.insert(carRefuel);
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
            CarRefuel pojo = new CarRefuel();
            pojo.setRefuelId(id);
            pojo.setIsDelete(1);
            carRefuelService.updateById(pojo);
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
            return result.success("成功",carRefuelService.selectById(id));
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
            EntityWrapper<CarRefuel> entityWrapper = new EntityWrapper<CarRefuel>();
            entityWrapper.and("is_delete=0");
            return result.success("成功",carRefuelService.selectList(entityWrapper));
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
            List<CarRefuel> carApplies = carRefuelService.selectList(null);
            PageInfo pageInfo = new PageInfo(carApplies);
            return result.success("成功",new DatagridResult(pageInfo.getTotal(), pageInfo.getList()));
        } catch (Exception e) {
            e.printStackTrace();
            return result.fail(e.getMessage());
        }
    }

    /**
     * 得到车辆加油总额，最近加油时间
     * @return
     */
    @RequestMapping("/getList")
    public List<CarRefuel> getCarRefuel(){
        return carRefuelService.getCarRefuel();
    }

    /**
     * 加油信息根据条件查找
     * @param startTime
     * @param endTime
     * @param carNumber
     * @param carDepartment
     * @return
     */
    @RequestMapping("/queryIt")
    public Result queryIt(String startTime,String endTime,String carNumber,String carDepartment ){
        HashMap hashMap = new HashMap();
        hashMap.put("startTime",startTime);
        hashMap.put("endTime",endTime);
        hashMap.put("carNumber",carNumber);
        hashMap.put("carDepartment",carDepartment);
        List<CarRefuel> carRefuels = carRefuelService.queryIt(hashMap);
        return result.success("ok",carRefuels);
    }
}
