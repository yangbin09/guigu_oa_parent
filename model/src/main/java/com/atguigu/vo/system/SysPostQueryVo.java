package com.atguigu.vo.system;

import lombok.Data;

/**
 * @author 阳斌
 */
@Data
public class SysPostQueryVo {
	
	//@ApiModelProperty(value = "岗位编码")
	@SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
	private String postCode;

	//@ApiModelProperty(value = "岗位名称")
	@SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
	private String name;

	//@ApiModelProperty(value = "状态（1正常 0停用）")
	@SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
	private Boolean status;


}

