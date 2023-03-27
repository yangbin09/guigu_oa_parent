package com.atguigu.auth;

import com.atguigu.auth.mapper.SysRoleMapper;

import com.atguigu.auth.service.SysRoleService;
import com.atguigu.model.system.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMpDemo2 {

    /**
     * 注入mapper
     */
    @Autowired
    SysRoleService sysRoleService;

    /**
     * 测试查询
     */
    @Test
    public void getAll(){
        //查询所有
        List<SysRole> list = sysRoleService.list();
        //打印
        list.forEach(System.out::println);
    }
}
