package com.xinhong.buildcontrol.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统常量
 * Created by Michael on 2017/8/16.
 */
public class Constant {

    private static final Logger logger = LoggerFactory.getLogger(Constant.class);

    /**
     * 成功
     */
    public final static String OPERATIONSTATUS_SUCCESS = "200";
    /**
     * 失败
     */
    public final static String OPERATIONSTATUS_FAIL = "400";
    /**
     * 参数不足
     */
    public final static String OPERATIONSTATUS_FAIL_PARAM = "401";

    /**
     * 不支持当前请求方法
     * @return
     */
    public final static String   METHOD_NOT_ALLOWED ="405";
    /**
     * 登录异常
     */
    public final static String   SHIRO_ERROR ="103";
    /**
     * 错误/异常
     */
    public final static String OPERATIONSTATUS_ERROR = "500";
    /**
     * 未登录
     */
    public final static String OPERATIONSTATUS_NOT_LOGIN = "LoginingOut";
    /**
     * 未授权
     */
    public final static String NO_PERMISSINO = "NoPermission";
    /**
     * 您没有该权限
     */
    public final static String UNAUTHO_ERROR = "104";



    //常用操作 MSG
    public final static String MSG_SUCCESS = "操作成功";
    public final static String MSG_FAIL = "操作失败";
    public final static String MSG_ERROR = "操作异常";
    public final static String MSG_NO_DATA = "无数据";
    public final static String MSG_NO_PARAM = "缺少参数";
    public final static String MSG_ERR_PARAM = "参数错误";
    public final static String MSG_NO_USE = "未选择人员";
    public final static String MSG_SAVE_SUCCESS = "保存成功";
    public final static String MSG_SAVE_FAIL = "保存失败";
    public final static String MSG_UPDATE_SUCCESS = "更新成功";
    public final static String MSG_UPDATE_FAIL = "更新失败";
    public final static String MSG_DELETE_SUCCESS = "删除成功";
    public final static String MSG_DELETE_FAIL = "删除失败";
    public final static String MSG_DELETE_PASSHOME_FAIL = "此用户未完成入室申请";
    public final static String MSG_LOGIN_NO = "请先登录";
    public final static String MSG_PARAMETER_NOT_PASS = "请确认参数是否完整";
    public final static String MSG_PERMISSION_TOKEN_EXPIRED = "许可证已过期";
    public final static String MSG_PERMISSION_TOKEN_INVALID = "权限标记无效";
    public final static String MSG_PERMISSION_SIGNATURE_ERROR = "权限签名错误";
    public final static String MSG_USER_NOT_LOGGED_IN = "用户未登录";


    /**
     * 二维码生成地址
     */
    public static final String QRAddress = "";

    /**
     * 二维码生成路径
     */
    public static final String QRCODE = "d:/qeocde/";
}
