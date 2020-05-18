package com.xinhong.buildcontrol.service;

import com.xinhong.buildcontrol.pojo.Car;
import com.xinhong.buildcontrol.pojo.Test1;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

    List<Car> getAll();

    Car getCarById(int id);

    List<Car> selectPageList(Integer currentPage, Integer pageSize, String startTime, String endTime, Integer state);

    int insertCar(Car car);

    int updateById(Car car);

    int deleteById(int carId);//删除

    int insertTest(Test1 test1);
}
