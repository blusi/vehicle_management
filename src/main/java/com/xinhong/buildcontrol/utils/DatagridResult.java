package com.xinhong.buildcontrol.utils;

import java.util.List;

/**
 * 封装分页查询结果
 */
public class DatagridResult<T> {

    private long totle;
    private List<T> list;

    public DatagridResult() {
    }

    public DatagridResult(long totle, List<T> list) {
        this.totle = totle;
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }


    public long getTotle() {
        return totle;
    }

    public void setTotle(long totle) {
        this.totle = totle;
    }
}
