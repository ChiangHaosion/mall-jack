package com.example.malljack.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName OssCallbackParam
 * @Description: oss上传成功后的回调参数
 * @Author Haosion
 * @Date 2019/10/28
 * @Version V1.0
 **/
@Setter
@Getter
public class OssCallbackParam {
    @ApiModelProperty("请求的回调地址")
    private String callbackUrl;
    @ApiModelProperty("回调是传入request中的参数")
    private String callbackBody;
    @ApiModelProperty("回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;
}