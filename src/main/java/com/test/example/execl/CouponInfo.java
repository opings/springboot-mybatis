package com.test.example.execl;

import com.github.houbb.iexcel.annotation.ExcelField;

/**
 * Created by Administrator on 2018/12/20.
 */
public class CouponInfo {
    @ExcelField(headName = "优惠券ID")
    private String couponCodeId;

    @ExcelField(headName = "优惠券券码表使用状态")
    private String couponUsed;

    @ExcelField(headName = "用户Id")
    private String userId;

    @ExcelField(headName = "用户名称")
    private String userName;

    @ExcelField(headName = "用户手机号")
    private String mobile;

    @ExcelField(headName = "绑定表状态")
    private String bindingStatus;

    @ExcelField(headName = "优惠活动")
    private String couponId;

    @ExcelField(headName = "券码与用户绑定时间")
    private String bindingTime;

    @ExcelField(headName = "订单号")
    private String orderId;

    @ExcelField(headName = "订单创建时间")
    private String orderCreateTime;


    @ExcelField(headName = "券码")
    private String code;

    public String getCouponCodeId() {
        return couponCodeId;
    }

    public void setCouponCodeId(String couponCodeId) {
        this.couponCodeId = couponCodeId;
    }

    public String getCouponUsed() {
        return couponUsed;
    }

    public void setCouponUsed(String couponUsed) {
        this.couponUsed = couponUsed;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBindingStatus() {
        return bindingStatus;
    }

    public void setBindingStatus(String bindingStatus) {
        this.bindingStatus = bindingStatus;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getBindingTime() {
        return bindingTime;
    }

    public void setBindingTime(String bindingTime) {
        this.bindingTime = bindingTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
