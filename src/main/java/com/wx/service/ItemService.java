package com.wx.service;

import com.wx.dto.ItemResponse;
import com.wx.dto.ResponseResult;
import com.wx.entity.Category;
import com.wx.entity.Item;
import com.wx.entity.User;
import com.wx.enums.CategoryEnums;
import com.wx.mapper.CategoryMapper;
import com.wx.mapper.ItemMapper;
import com.wx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CategoryMapper categoryMapper;


    @Transactional
    public int addItem(Item item){
        User user = userMapper.queryUserByOpenId(item.getUser().getOpenid());
        item.setUser(user);
        return itemMapper.addItem(item);

    }

    @Transactional
    public int updateItem(Item item){
        return itemMapper.updateItem(item);

    }

    @Transactional
    public int deleteItem(Integer id){

        return itemMapper.deleteItem(id);

    }

    @Transactional
    public ItemResponse queryItemById(Integer id){
        Item item = itemMapper.queryItemById(id);
        ItemResponse response = new ItemResponse();
        response.setId(item.getId());
        response.setUser(item.getUser());
        response.setCategory(item.getCategory());
        response.setTitle(item.getTitle());
        response.setTime(item.getTime());
        response.setStyle(item.getStyle());
        response.setAreas(item.getAreas());
        response.setAddress(item.getAddress());
        response.setDetailDesc(item.getDetailDesc());
        List<String> imgs = new ArrayList<>();
        if(item.getImg1()!=null && item.getImg1()!=""){
            imgs.add(item.getImg1());
        }
        if(item.getImg2()!=null && item.getImg2()!=""){
            imgs.add(item.getImg2());
        }
        if(item.getImg3()!=null && item.getImg3()!=""){
            imgs.add(item.getImg3());
        }
        response.setImgs(imgs);
        return response;

    }

    @Transactional
    public ResponseResult queryItemList(){
        ResponseResult responseResult = new ResponseResult();
        //寻物启事
        Category categoryxw = categoryMapper.queryCategoryByName(CategoryEnums.XWQS.getName());
        List<Item> itemsxw = itemMapper.queryItemListByCategoryId(categoryxw.getId());
        responseResult.setXw(itemsxw);
        //寻人启事
        Category categoryxr = categoryMapper.queryCategoryByName(CategoryEnums.XRQS.getName());
        List<Item> itemsxr = itemMapper.queryItemListByCategoryId(categoryxr.getId());
        responseResult.setXr(itemsxr);
        //寻宠启示
        Category categoryxc = categoryMapper.queryCategoryByName(CategoryEnums.XCQS.getName());
        List<Item> itemsxc = itemMapper.queryItemListByCategoryId(categoryxc.getId());
        responseResult.setXc(itemsxc);
        //失物招领
        Category categorysz = categoryMapper.queryCategoryByName(CategoryEnums.SWZL.getName());
        List<Item> itemssz = itemMapper.queryItemListByCategoryId(categorysz.getId());
        responseResult.setSz(itemssz);
        return responseResult;

    }

    @Transactional
    public List<Item> queryItemListByUserId(Integer userId){
        return itemMapper.queryItemListByUserId(userId);
    }
}
