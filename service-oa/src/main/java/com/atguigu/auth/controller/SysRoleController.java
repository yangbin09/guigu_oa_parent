package com.atguigu.auth.controller;

import com.atguigu.auth.service.SysRoleService;
import com.atguigu.model.system.SysRole;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 阳斌
 */
@RestController
@RequestMapping("/admin/system/sysRole")
public class SysRoleController {

    /**
     * 注入service
     */
    private final SysRoleService sysRoleService;


    public SysRoleController(SysRoleService sysRoleService) {
        this.sysRoleService = sysRoleService;
    }

    /**
     * 测试查询所有角色
     */
    @RequestMapping("/findAll")
    public List<SysRole> findAll() {
        //查询所有
        return sysRoleService.list();
    }

}
