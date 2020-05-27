package com.xinhong.buildcontrol.utils;

import java.text.ParseException;
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

    /**
     * 计算时间
     * @param startTime ： 开始时间
     * @param endTime  ： 结束时间
     * @return
     */
    public static int caculateTotalTime(String startTime,String endTime) {
        SimpleDateFormat formatter =   new SimpleDateFormat( "yyyy-MM-dd");
        Date date1=null;
        Date date = null;
        Long l = 0L;
        try {
            date = formatter.parse(endTime);
            long ts = date.getTime();
            date1 =  formatter.parse(startTime);
            long ts1 = date1.getTime();

            l = (ts - ts1) / (1000 * 60 * 60 * 24);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return l.intValue();
    }
}
