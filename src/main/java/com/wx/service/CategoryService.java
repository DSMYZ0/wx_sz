package com.wx.service;

import com.wx.entity.Category;
import com.wx.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Transactional(readOnly = true)
    public List<Category> queryCategoryList(){
        return categoryMapper.queryCategoryList();
    }

    @Transactional(readOnly = true)
    public Category queryCategoryById(Integer id){
        return categoryMapper.queryCategoryById(id);
    }

    @Transactional(readOnly = true)
    public Category queryCategoryByName(String name){
        return categoryMapper.queryCategoryByName(name);
    }

}
