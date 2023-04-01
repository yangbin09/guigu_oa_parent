package com.atguigu.common.handler;

import com.atguigu.common.result.ResultCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 自定义全局异常类
 *
 * @author 阳斌
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GuiguException extends RuntimeException {

    private Integer code;

    private String message;

    /**
     * 通过状态码和错误消息创建异常对象
     * @param code 状态码
     * @param message 错误消息
     */
    public GuiguException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    /**
     * 接收枚举类型对象
     * @param resultCodeEnum 枚举类型对象
     */
    public GuiguException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }


}
