package com.atguigu.common.result;

import lombok.Getter;

/**
 * 统一返回结果状态信息类
 * @author 阳斌
 */
@Getter
public enum ResultCodeEnum {
    /**
     * 成功
     */
    SUCCESS(200,"成功"),
    /**
     * 失败
     */
    FAIL(201, "失败"),
    /**
     * 服务异常
     */
    SERVICE_ERROR(2012, "服务异常"),
    /**
     * 数据异常
     */
    DATA_ERROR(204, "数据异常"),
    /**
     * 未登陆
     */
    LOGIN_AUTH(208, "未登陆"),
    /**
     * 没有权限
     */
    PERMISSION(209, "没有权限");

    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 状态信息
     */
    private final String message;
    /**
     * 构造方法
     * @param code 状态码
     * @param message 状态信息
     */
    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
