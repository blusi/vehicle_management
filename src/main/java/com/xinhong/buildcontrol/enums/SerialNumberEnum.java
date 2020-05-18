package com.xinhong.buildcontrol.enums;

import lombok.Getter;

/**
 * ClassName: SerialNumberEnum
 * Function:  TODO
 * Date:      2019/11/14 15:26
 * author     DELL
 * version    V1.0
 * 流水号
 */
@Getter
public enum SerialNumberEnum {

    LY("asset_base_use_return","LY","领用流水号")
    ,JY("asset_base_borrow_return","JY","借用流水号")
    ,DB("asset_base_allot","DB","调拨流水号")
    ,SWXX("asset_base_change_record_material","SWXX","实物信息修改流水号")
    ,CWXX("asset_base_change_record_finance","CWXX","财务信息修改流水号")
    ,WBXX("asset_base_maintain_msg","WBBG","维保信息修改流水号")
    ,WX("asset_base_maintain_record","WX","维修登记修改流水号")
    ,XH("asset_base_destruction","XH","销毁流水号")
    ,HCDB("goods_allot_storage","HCDB","耗材调拨")
    ,HCRK("goods_in_storage","HCRK","耗材入库")
    ,HCCK("goods_out_storage","HCCK","耗材出库")
    ,HCTZ("goods_warehouse_goods_record","HCTZ","耗材调整")
    ,GDGL("work_order_base","GDGL","工单")
    ;

    private String tableName;

    private String number;

    private String msg;

    SerialNumberEnum(String tableName, String number, String msg) {
        this.tableName = tableName;
        this.number = number;
        this.msg = msg;
    }
}
