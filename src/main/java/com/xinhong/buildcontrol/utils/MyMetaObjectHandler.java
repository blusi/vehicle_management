package com.xinhong.buildcontrol.utils;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

@Component
public class MyMetaObjectHandler extends MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        //插入时的填充策略



    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
