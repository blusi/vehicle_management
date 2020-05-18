package com.xinhong.buildcontrol.service.impl;

import com.xinhong.buildcontrol.mapper.CarMapper;
import com.xinhong.buildcontrol.pojo.Car;
import com.xinhong.buildcontrol.pojo.Test1;
import com.xinhong.buildcontrol.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    CarMapper carMapper;

    @Override
    public List<Car> getAll() {

        List<Car> car = carMapper.getAll();
        return car;
    }

    @Override
    public Car getCarById(int id) {

        return carMapper.getCarById(id);
    }

    @Override
    public List<Car> selectPageList(Integer currentPage, Integer pageSize, String startTime, String endTime, Integer state) {
        return carMapper.selectPageList(currentPage,pageSize,startTime,endTime,state);
    }

    @Override
    public int insertCar(Car car) {

        return carMapper.insertCar(car);
    }

    @Override
    public int updateById(Car car) {
        return carMapper.updateById(car);
    }

    @Override
    public int deleteById(int carId) {
        return carMapper.deleteById(carId);
    }

    @Override
    public int insertTest(Test1 test1) {
        return carMapper.insertTest(test1);
    }


}
