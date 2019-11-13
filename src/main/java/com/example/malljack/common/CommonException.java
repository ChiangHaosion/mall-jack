package com.example.malljack.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName CommonException
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/27
 * @Version V1.0
 **/
@Setter
@Getter
public class CommonException extends RuntimeException{

    private CodeMsg codeMsg;
    public CommonException() {
        super();
    }
    public CommonException(CodeMsg resultCode) {
        super(resultCode.getMsg());
        this.codeMsg=resultCode;
    }

}
