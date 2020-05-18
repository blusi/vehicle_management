package com.xinhong.buildcontrol.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xinhong.buildcontrol.pojo.Car;
import com.xinhong.buildcontrol.pojo.Test1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarMapper extends BaseMapper<Car> {

    List<Car> getAll();//查找

    @Select("SELECT * FROM car_info WHERE car_id=#{id}")
    Car getCarById(int id);//根据id查找

    @Select("select * from car_info limit #{state},#{pageSize}")
    List<Car> selectPageList(Integer currentPage, Integer pageSize, String startTime, String endTime, Integer state);

//    @Insert("INSERT INTO car_info (car_number, car_brand, car_name, car_type, car_status, car_age, car_department, car_possessor, car_engine_number, car_function, car_vin, car_registration_date, car_licence_issued, car_operator,car_create) " +
//            "VALUES" +
//            " (#{carNumber},#{carBrand},#{carName},#{carType},#{carStatus},#{carAge},#{carDepartment},#{carPossessor},#{carEngineNumber},#{carFunction},#{carVin},#{carRegistrationDate},#{carLicenceIssued},#{carOperator},#{carCreate})")
    int insertCar(Car car);//添加

    Integer updateById(Car car);//修改

    int deleteById(int carId);//删除

    @Insert("insert into test (id,test_name) values (#{id},#{testName})")
    int insertTest(Test1 test1);

}
