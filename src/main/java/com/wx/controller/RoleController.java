package com.wx.controller;

import com.wx.entity.Role;
import com.wx.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private RoleService roleService;

    @GetMapping("/addRole")
    public String addRole(@RequestBody Role role){
        LOGGER.info("role={}",role);
        int i = roleService.addRole(role);
        if(i>0){
            return "ok";
        }else{
            return "fail";
        }
    }

    @GetMapping("/queryRoleList")
    public List<Role> queryRoleList(){

        return roleService.queryRoleList();

    }

    @GetMapping("/queryRoleById")
    public Role queryRoleById(Integer id){

        return roleService.queryRoleById(id);

    }

}
