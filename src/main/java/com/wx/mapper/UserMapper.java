package com.wx.mapper;

import com.wx.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    //添加用户
    int addUser(User user);
    //删除用户
    int deleteUserById(Integer id);
    //更新用户
    int updateUser(User user);
    //获取列表
    List<User> queryUserList();
    //根据ID获取用户
    User queryUserById(Integer id);
    //通过openid查询是否授权过
    User queryUserByOpenId(String openid);

}
