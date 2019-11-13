package com.example.malljack.common;

import org.springframework.web.bind.annotation.*;

/**
 * @ClassName CommonAdvice
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/27
 * @Version V1.0
 **/
@ControllerAdvice
public class CommonAdvice {
    @ExceptionHandler(CommonException.class)
    @ResponseBody
    public CommonResult handlerBusinessException(CommonException ex){
        return CommonResult.error(ex.getCodeMsg());
    }
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResult handlerException(Exception ex){
        ex.printStackTrace();
        return CommonResult.defaultError();
    }
}
