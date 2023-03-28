package com.atguigu.common.result;

import lombok.Data;

/**
 * @author 阳斌
 */
@Data
public class Result<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 状态信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    /**
     * 私有构造方法
     */
    private Result() {
    }

    /**
     * 构建返回结果
     */
    protected static <T> Result<T> build(T data) {
        Result<T> result = new Result<>();
        if (data != null) {
            result.setData(data);
        }
        return result;
    }

    /**
     * 构建返回结果
     *
     * @param body    返回数据
     * @param code    状态码
     * @param message 状态信息
     * @param <T>     返回数据类型
     * @return 返回结果
     */
    public static <T> Result<T> build(T body, Integer code, String message) {
        Result<T> result = build(body);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    /**
     * 构建返回结果
     *
     * @param body           返回数据
     * @param resultCodeEnum 状态码枚举
     * @param <T>            返回数据类型
     * @return 返回结果
     */
    public static <T> Result<T> build(T body, ResultCodeEnum resultCodeEnum) {
        Result<T> result = build(body);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    public static <T> Result<T> ok() {
        return Result.ok(null);
    }

    /**
     * 操作成功
     *
     * @param data 返回数据
     * @param <T>  返回数据类型
     * @return 返回结果
     */
    public static <T> Result<T> ok(T data) {
        Result<T> result = build(data);
        return build(data, ResultCodeEnum.SUCCESS);
    }

    /**
     * 操作失败
     *
     * @return 返回结果
     */
    public static <T> Result<T> fail() {
        return Result.fail(null);
    }

    /**
     * 操作失败
     *
     * @param data 返回数据
     * @param <T>  返回数据类型
     * @return 返回结果
     */
    public static <T> Result<T> fail(T data) {
        Result<T> result = build(data);
        return build(data, ResultCodeEnum.FAIL);
    }

    /**
     * 操作失败
     *
     * @param msg 返回信息
     * @return 返回结果
     */
    public Result<T> message(String msg) {
        this.setMessage(msg);
        return this;
    }

    /**
     * 操作失败
     *
     * @param code 返回状态码
     * @return 返回结果
     */
    public Result<T> code(Integer code) {
        this.setCode(code);
        return this;
    }
}
