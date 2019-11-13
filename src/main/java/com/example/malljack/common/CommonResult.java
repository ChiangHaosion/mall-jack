package com.example.malljack.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @ClassName CommonResult
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/13
 * @Version V1.0
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private int code;
    private String msg;
    private T data;

    //成功返回结果
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(CodeMsg.SUCCESS.getCode(),CodeMsg.SUCCESS.getMsg(),data);
    }

    //成功返回结果
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<>(CodeMsg.SUCCESS.getCode(),message,data);
    }

    //失败返回结果
    public static CommonResult error(CodeMsg codeMsg){
        return new CommonResult<>(codeMsg.getCode(),codeMsg.getMsg(),null);
    }
    //失败返回结果
    public static CommonResult error(String msg){
        return new CommonResult<>(CodeMsg.ERROR.getCode(),msg,null);
    }
    //失败返回结果
    public static CommonResult defaultError(){
        return new CommonResult<>(CodeMsg.ERROR.getCode(),CodeMsg.ERROR.getMsg(),null);
    }

}