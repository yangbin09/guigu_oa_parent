package com.atguigu.vo.system;

import lombok.Data;

/**
 * @author 阳斌
 */
@Data
public class SysOperLogQueryVo {

	private String title;
	private String operName;

	private String createTimeBegin;
	private String createTimeEnd;

}

