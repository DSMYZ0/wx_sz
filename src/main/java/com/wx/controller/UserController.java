package com.wx.controller;

import com.alibaba.fastjson.JSON;
import com.wx.entity.Role;
import com.wx.entity.User;
import com.wx.enums.RoleEnums;
import com.wx.service.RoleService;
import com.wx.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;


    @PostMapping("/checkUserLogin")
    public boolean checkUserLogin(@RequestBody String openid){
        LOGGER.info("openid={}",JSON.parseObject(openid, Map.class).get("openid"));
        return userService.checkUserLogin(JSON.parseObject(openid, Map.class).get("openid")+"");
    }


    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        if(user.getPassword()==null || user.getPassword()==""){
            user.setPassword("admin");
        }
        if(user.getRole()==null || user.getRole().getId()==null){
            Role role = roleService.queryRoleByName(RoleEnums.PTYH.getMsg());
            user.setRole(role);
        }
        int row = userService.addUser(user);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }

    @GetMapping("/deleteUserById")
    public String deleteUserById(Integer id){
        int row = userService.deleteUserById(id);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        LOGGER.info("user={}",user);
        int row = userService.updateUser(user);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        return userService.queryUserList();

    }

    @GetMapping("/queryUserById")
    public User queryUserById(Integer id){
        return userService.queryUserById(id);

    }

    @GetMapping("/queryUserByOpenid")
    public User queryUserByOpenid(@RequestBody String openid){
        Map map = JSON.parseObject(openid, Map.class);
        return userService.queryUserByOpenid(map.get("openid")+"");
    }
}
