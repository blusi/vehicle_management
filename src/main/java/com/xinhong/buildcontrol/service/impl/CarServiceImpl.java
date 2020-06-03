package com.xinhong.buildcontrol.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinhong.buildcontrol.mapper.CarMapper;
import com.xinhong.buildcontrol.pojo.CarInfo;
import com.xinhong.buildcontrol.service.CarService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarServiceImpl extends ServiceImpl<CarMapper, CarInfo> implements CarService {

//    @Autowired
//    CarMapper carMapper;
//
//    @Override
//    public List<CarInfo> getAll() {
//
//        List<CarInfo> car = carMapper.getAll();
//        return car;
//    }
//
//    @Override
//    public CarInfo getCarById(int id) {
//
//        return carMapper.getCarById(id);
//    }
//
//    @Override
//    public List<CarInfo> selectPageList(Integer currentPage, Integer pageSize, String startTime, String endTime, Integer state) {
//        return carMapper.selectPageList(currentPage,pageSize,startTime,endTime,state);
//    }
//
//    @Override
//    public int insertCar(CarInfo car) {
//
//        return carMapper.insertCar(car);
//    }
//
//    @Override
//    public boolean updateById(CarInfo car) {
//        return carMapper.updateById(car);
//    }
//
//    @Override
//    public int deleteById(int carId) {
//        return carMapper.deleteById(carId);
//    }
//
//    @Override
//    public int insertTest(Test1 test1) {
//        return carMapper.insertTest(test1);
//    }
//

}
