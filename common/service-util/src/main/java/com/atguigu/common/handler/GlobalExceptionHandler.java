package com.atguigu.common.handler;

import com.atguigu.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 全局异常处理类
 *
 * @author 阳斌
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理所有异常
     * @param e 异常
     * @return 返回结果
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail();
    }
    /**
     * 处理特定异常
     * @param e 异常
     * @return 返回结果
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error(ArithmeticException e){
        e.printStackTrace();
        return Result.fail().message("执行了特定异常处理");
    }

    /**
     * 自定义异常
     * @param e 异常
     * @return 返回结果
     */
    @ExceptionHandler(GuiguException.class)
    @ResponseBody
    public Result error(GuiguException e){
        e.printStackTrace();
        return Result.fail().message(e.getMessage()).code(e.getCode());
    }
}