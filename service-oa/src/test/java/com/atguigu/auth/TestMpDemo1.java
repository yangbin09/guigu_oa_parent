package com.atguigu.auth;


import com.atguigu.auth.mapper.SysRoleMapper;
import com.atguigu.model.system.SysRole;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class TestMpDemo1 {

    //注入mapper
    @Autowired
    SysRoleMapper sysRoleMapper;

    /**
     * 测试查询
     */
    @Test
    public void getAll() {
        sysRoleMapper.selectList(null).
                forEach(System.out::println);
    }

    /**
     *  测试添加
     */
    @Test
    public void add() {
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("测试角色");
        sysRole.setRoleCode("test");
        sysRole.setDescription("测试角色");
        int insert = sysRoleMapper.insert(sysRole);
        System.out.println(sysRole.getId());
        System.out.println(insert);
    }

    /**
     * 测试修改
     */
    @Test
    public void update() {
        SysRole sysRole = new SysRole();
        sysRole.setId(10L);
        sysRole.setRoleName("测试角色修改");
        int i = sysRoleMapper.updateById(sysRole);
        System.out.println(i);
    }
    /**
     * 测试删除
     */
    @Test
    public void delete() {
        int i = sysRoleMapper.deleteById(10L);
        System.out.println(i);
    }

    /**
     * 测试批量删除
     */
    @Test
    public void deleteBatch() {
        int i = sysRoleMapper.deleteBatchIds(Arrays.asList(11L, 12L));
        System.out.println(i);
    }

    /**
     * 测试条件查询
     */
    @Test
    public void testSelectByMap() {
        //创建map集合
        Map<String, Object> map = new HashMap<>();
        //设置条件
        map.put("role_name", "测试角色");
        map.put("role_code", "test");
        //查询
        List<SysRole> sysRoles = sysRoleMapper.selectByMap(map);
        //打印
        sysRoles.forEach(System.out::println);
    }

    /**
     * 测试条件查询
     */
    @Test
    public void testQuery() {
        //创建QueryWrapper对象,调用方法设置条件
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        //设置条件
        queryWrapper.eq("role_name", "测试角色");
        //查询
        List<SysRole> sysRoles = sysRoleMapper.selectList(queryWrapper);
        //打印
        sysRoles.forEach(System.out::println);
    }

    /**
     * 测试表达式查询
     */
    @Test
    public void testQuery2() {
        //创建QueryWrapper对象,调用方法设置条件
        LambdaQueryWrapper<SysRole> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //设置条件
        lambdaQueryWrapper.eq(SysRole::getRoleName, "测试角色");

        //查询
        List<SysRole> sysRoles = sysRoleMapper.selectList(lambdaQueryWrapper);
        //打印
        sysRoles.forEach(System.out::println);
    }

}
