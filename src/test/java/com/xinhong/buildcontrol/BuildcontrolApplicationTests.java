package com.xinhong.buildcontrol;

import com.xinhong.buildcontrol.utils.TimeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BuildcontrolApplicationTests {



    @Test
    public void t1(){
        String starTime = "2019-05-08";
        String endTime =  "2019-06-10";
        int i = TimeUtils.caculateTotalTime(starTime, endTime);
        System.out.println("结果为："+i);
    }


}
