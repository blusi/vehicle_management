package com.xinhong.buildcontrol.utils;

import java.io.Serializable;

/**
 * 返回结果 - 提供给后台管理使用
 * Created by Michael on 2017/8/21.
 */
public class Result implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -533236848068213014L;

	/** 返回状态 */
	public String status = Constant.OPERATIONSTATUS_SUCCESS;

    /** 提示消息 */
    public String msg = Constant.MSG_SUCCESS;

    /** 返回数据/对象 */
    public Object data = new Object();



    /**
     * 未授权
     * @return
     */
    public Result notPermission(){
        this.status = Constant.NO_PERMISSINO;
        this.msg = "暂无此权限";
        this.data = null;
        return this;
    }

    /**
     * 请重新登录
     * @return
     */
    public Result notLoginOrTimeOut(){
        this.status = Constant.SHIRO_ERROR;
        this.msg = "请重新登录";
        this.data = null;
        return this;
    }

    /**
     *
     * @return
     */
    public Result notParam(){
        this.status = Constant.OPERATIONSTATUS_FAIL_PARAM;
        this.msg = "参数错误";
        this.data = null;
        return this;
    }

    /**
     * 未登录
     * @return
     */
    public Result notLogin(){
        this.status = Constant.OPERATIONSTATUS_NOT_LOGIN;
        this.msg = "未登录";
        this.data = null;
        return this;
    }

    /**
     * 成功
     * @return
     */
    public Result success(){
        this.status = Constant.OPERATIONSTATUS_SUCCESS;
        this.msg = "成功";
        this.data = null;
        return this;
    }

    /**
     * 成功
     * @param msg
     * @return
     */
    public Result success(String msg){
        this.status = Constant.OPERATIONSTATUS_SUCCESS;
        this.msg = msg;
        this.data = null;
        return this;
    }

    /**
     * 成功
     * @param msg 提示
     * @param object 返回数据/对象
     * @return
     */
    public Result success(String msg,Object object){
        this.status = Constant.OPERATIONSTATUS_SUCCESS;
        this.msg = msg;
        this.data = object;
        return this;
    }
    /**
     * 异常
     * @return
     */
    public Result error(){
        this.status = Constant.OPERATIONSTATUS_ERROR;
        this.msg = "异常";
        this.data = null;
        return this;
    }

    /**
     * 异常
     * @param msg 异常提示
     * @return
     */
    public Result error(String msg){
        this.status = Constant.OPERATIONSTATUS_ERROR;
        this.msg = msg;
        this.data = null;
        return this;
    }
    /**
     * 异常
     * @param msg 异常提示
     * @return  object 返回数据/对象
     */
    public Result error(String msg,Object object){
        this.status = Constant.OPERATIONSTATUS_ERROR;
        this.msg = msg;
        this.data = object;
        return this;
    }
    /**
     * 失败
     * @return
     */
    public Result fail(){
        this.status = Constant.OPERATIONSTATUS_FAIL;
        this.msg = "失败";
        this.data = null;
        return this;
    }
    /**
     * 失败
     * @param msg 失败提示
     * @return
     */
    public Result fail(String msg){
        this.status = Constant.OPERATIONSTATUS_FAIL;
        this.msg = msg;
        this.data = null;
        return this;
    }

    /**
     * 失败
     * @param msg 失败提示
     * @return object 返回数据/对象
     */
    public Result fail(String msg,Object object){
        this.status = Constant.OPERATIONSTATUS_FAIL;
        this.msg = msg;
        this.data = object;
        return this;
    }
    /**
     * 默认返回
     * @param object
     * @return
     */
    public Result defaultData(Object object){
        this.status = Constant.OPERATIONSTATUS_SUCCESS;
        this.msg = Constant.MSG_SUCCESS;
        this.data = object;
        return this;
    }
    
    public Result() {

    }

    public Result(String status, Object object) {
        this.status = status;
        this.data = object;
    }
    public Result(String status, String msg, Object object) {
        this.status = status;
        this.msg = msg;
        this.data = object;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        this.msg = "";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
