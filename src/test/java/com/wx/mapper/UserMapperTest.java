package com.wx.mapper;

import com.wx.WxSzApplicationTests;
import com.wx.entity.Category;
import com.wx.entity.Role;
import com.wx.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest extends WxSzApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void queryUserById(){
        User user = userMapper.queryUserById(11);
        System.out.println(user);
    }

    @Test
    public void queryUserList(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }

    @Test
    public void addUser(){

        User user  = new User();
        user.setName("admin");
        user.setPassword("password");
        user.setGender(1);
        user.setOpenid("abcndjfjeifmedsfsljfklsdjfsdkl");
        Role role = new Role();
        role.setId(10);
        user.setRole(role);
        int row = userMapper.addUser(user);
        System.out.println(row);
    }

    @Test
    public void deleteUserById(){
        int row = userMapper.deleteUserById(10);
        System.out.println(row);
    }

    @Test
    public void updateUser(){
        User user  = new User();

        user.setId(11);
        user.setName("admin1");
        user.setPassword("password1");
        user.setGender(1);
        user.setOpenid("qqqqqqqqqqqqqqqqqq");
        Role role = new Role();
        role.setId(10);
        user.setRole(role);

        int row = userMapper.updateUser(user);
        System.out.println(row);

    }
}