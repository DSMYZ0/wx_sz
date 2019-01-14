package com.wx.mapper;

import com.wx.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 类目表的数据库持久层
 */
@Mapper
@Component
public interface CategoryMapper {

    /**
     * 获取分类列表
     */
    List<Category> queryCategoryList();

    /**
     * 根据分类ID获取分类详情
     */
    Category queryCategoryById(Integer id);

    /**
     * 根据名字获取分类
     */
    Category queryCategoryByName(String name);

}
