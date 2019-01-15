package com.wx.mapper;

import com.wx.entity.$Collection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface $CollectionMapper {

    //添加收藏
    int addCollection(@Param("userId") Integer userId,@Param("itemId")Integer itemId);
    //删除收藏通过收藏ID
    int deleteCollectionById(Integer collectionId);
    //删除收藏通过用户ID和项目ID
    int deleteCollectionByUserIdAndItemId(@Param("userId") Integer userId,@Param("itemId") Integer itemId);
    //获取我的收藏列表
    List<$Collection> queryCollectionByUserId(Integer userId);
    //获取收藏详情
    $Collection queryCollectionById(Integer id);
}
