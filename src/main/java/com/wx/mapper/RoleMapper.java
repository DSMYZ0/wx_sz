package com.wx.mapper;

import com.wx.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RoleMapper {
    //插入角色
    int addRole(Role role);
    //查询角色列表
    List<Role> queryRoleList();
    //根据ID查询角色
    Role queryRoleById(Integer id);
    //根据名字获取角色
    Role queryRoleByName(String name);
}
