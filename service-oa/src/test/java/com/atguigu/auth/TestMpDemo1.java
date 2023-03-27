package com.atguigu.auth;


import com.atguigu.auth.mapper.SysRoleMapper;
import com.atguigu.model.system.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        System.out.println(sysRole);
        System.out.println(insert);
    }

}
