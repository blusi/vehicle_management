package com.xinhong.buildcontrol.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    public String getTime1(){
        Date date = new Date();//获取时间戳
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf1.format(date);
        return time;
    }
    public String getTime2(){
        Date date = new Date();//获取时间戳
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String time2 = sdf2.format(date);
        return time2;
    }
}
