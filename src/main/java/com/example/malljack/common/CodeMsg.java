package com.example.malljack.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName CodeMsg
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/27
 * @Version V1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CodeMsg implements Serializable {
    private int code;
    private String msg;

    public static final CodeMsg SUCCESS=new CodeMsg(200,"操作成功");
    public static final CodeMsg ERROR=new CodeMsg(500,"操作失败");
    public static final CodeMsg PARAERROR =new CodeMsg(500001,"参数异常");
}
