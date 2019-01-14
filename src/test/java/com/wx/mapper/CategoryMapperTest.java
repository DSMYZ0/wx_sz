package com.wx.mapper;

import com.wx.WxSzApplicationTests;
import com.wx.entity.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class CategoryMapperTest extends WxSzApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void queryCategoryList(){
        List<Category> categoryList = categoryMapper.queryCategoryList();
        System.out.println(categoryList);
    }

    @Test
    public void queryCategoryById(){
        Category category = categoryMapper.queryCategoryById(11);
        System.out.println(category);
    }

    @Test
    public void queryCategoryByName(){
        Category category = categoryMapper.queryCategoryByName("寻人启事");
        System.out.println(category);
    }

}