package com.example.malljack.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName OssCallbackResult
 * @Description: oss上传文件的回调结果
 * @Author Haosion
 * @Date 2019/10/28
 * @Version V1.0
 **/
@Setter
@Getter
public class OssCallbackResult {
    @ApiModelProperty("文件名称")
    private String filename;
    @ApiModelProperty("文件大小")
    private String size;
    @ApiModelProperty("文件的mimeType")
    private String mimeType;
    @ApiModelProperty("图片文件的宽")
    private String width;
    @ApiModelProperty("图片文件的高")
    private String height;

}
