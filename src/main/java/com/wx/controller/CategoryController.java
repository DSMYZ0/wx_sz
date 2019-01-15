package com.wx.controller;

import com.wx.entity.Category;
import com.wx.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/queryCategoryList")
    public List<Category> queryCategoryList(){
        return categoryService.queryCategoryList();
    }

    @GetMapping("/queryCategoryById")
    public Category queryCategoryById(Integer id){
        return categoryService.queryCategoryById(id);
    }

    @GetMapping("/queryCategoryByName")
    public Category queryCategoryByName(String name){
        return categoryService.queryCategoryByName(name);
    }
}
