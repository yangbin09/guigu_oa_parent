//
//
package com.atguigu.vo.system;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 角色查询实体
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@Data
public class SysRoleQueryVo implements Serializable {
	/**
	 *  序列化
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 角色名称
	 */
	private String roleName;

}

