package com.wx.service;

import com.wx.entity.Role;
import com.wx.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Transactional
    public int addRole(Role role){
        return roleMapper.addRole(role);
    }

    @Transactional(readOnly = true)
    public List<Role> queryRoleList(){

        return roleMapper.queryRoleList();

    }

    @Transactional(readOnly = true)
    public Role queryRoleById(Integer id){

        return roleMapper.queryRoleById(id);

    }
}
