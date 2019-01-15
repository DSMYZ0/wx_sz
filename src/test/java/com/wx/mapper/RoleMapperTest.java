package com.wx.mapper;

import com.wx.WxSzApplicationTests;
import com.wx.entity.Role;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class RoleMapperTest extends WxSzApplicationTests {

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void queryRoleByName(){
        Role role = roleMapper.queryRoleByName("public");
        System.out.println(role);
    }

    @Test
    public void addRole(){
        Role role = new Role();
        role.setName("public");
        int row = roleMapper.addRole(role);
        System.out.println(row);
    }

    @Test
    public void queryRoleList(){
        List<Role> roles = roleMapper.queryRoleList();
        System.out.println(roles);
    }

    @Test
    public void queryRoleById(){
        Role role = roleMapper.queryRoleById(10);
        System.out.println(role);
    }

}