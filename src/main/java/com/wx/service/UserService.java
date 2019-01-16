package com.wx.service;

import com.wx.entity.User;
import com.wx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int addUser(User user){
        return userMapper.addUser(user);
    }

    @Transactional
    public int deleteUserById(Integer id){
        return userMapper.deleteUserById(id);
    }

    @Transactional
    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    @Transactional
    public List<User> queryUserList(){
        return userMapper.queryUserList();
    }

    @Transactional
    public User queryUserById(Integer id){
        return userMapper.queryUserById(id);
    }

    @Transactional
    public boolean checkUserLogin(String openid){
        User user = userMapper.queryUserByOpenId(openid);
        System.out.println(user);
        return user!=null?true:false;
    }

    @Transactional
    public User queryUserByOpenid(String openid){
        return userMapper.queryUserByOpenId(openid);
    }

}
