package com.atguigu.vo.system;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 阳斌
 */
@Data
public class SysLoginLogQueryVo {
	
	@ApiModelProperty(value = "用户账号")
	private String username;

	private String createTimeBegin;
	private String createTimeEnd;

}

