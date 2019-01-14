package com.wx.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Mapper
@Component
public interface $CollectionMapper {

    //添加收藏
    int addCollection(@Param("userId") Integer userId,@Param("itemId")Integer itemId);
    //删除收藏通过收藏ID
    int deleteCollectionById(Integer collectionId);
    //删除收藏通过用户ID和项目ID
    int deleteCollectionByUserIdAndItemId(@Param("userId") Integer userId,@Param("itemId") Integer itemId);
}
