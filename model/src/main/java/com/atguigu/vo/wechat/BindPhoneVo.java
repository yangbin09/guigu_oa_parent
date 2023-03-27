package com.atguigu.vo.wechat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @author 阳斌
 * @Data 2023/3/27 15:10
 */
@Data
public class BindPhoneVo {

    @ApiModelProperty(value = "手机")
    private String phone;

    @ApiModelProperty(value = "openId")
    private String openId;
}
