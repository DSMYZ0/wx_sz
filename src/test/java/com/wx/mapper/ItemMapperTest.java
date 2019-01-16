package com.wx.mapper;

import com.wx.WxSzApplicationTests;
import com.wx.entity.Category;
import com.wx.entity.Item;
import com.wx.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ItemMapperTest extends WxSzApplicationTests {

    @Autowired
    private ItemMapper itemMapper;


    @Test
    public void queryItemList(){
        List<Item> items = itemMapper.queryItemList();
        System.out.println(items);
    }

    @Test
    public void queryItemById(){
        Item item = itemMapper.queryItemById(10);
        System.out.println(item);
    }

    @Test
    public void updateItem(){

        Item item = new Item();
        item.setId(10);
        User user = new User();
        user.setId(11);
        item.setUser(user);
        Category c = new Category();
        c.setId(10);
        item.setCategory(c);
        item.setTitle("标题1");
        item.setTime("2019-11-13");
        item.setStyle("电脑1");
        item.setAreas("黑龙江-哈尔滨1");
        item.setAddress("详细地址1");
        item.setDetailDesc("详情描述1");
        item.setImg1("http://dasdasdasdsad.com1");
        item.setImg2("http://dasdasdasdsad.com1");
        item.setImg3("http://dasdasdasdsad.com1");

        int row = itemMapper.updateItem(item);
        System.out.println(row);
    }

    @Test
    public void addItem(){

        Item item = new Item();
        User user = new User();
        user.setId(11);
        item.setUser(user);
        Category c = new Category();
        c.setId(10);
        item.setCategory(c);
        item.setTitle("标题");
        item.setTime("2019-11-12");
        item.setStyle("电脑");
        item.setAreas("黑龙江-哈尔滨");
        item.setAddress("详细地址");
        item.setDetailDesc("详情描述");
        item.setImg1("http://dasdasdasdsad.com");
        item.setImg2("http://dasdasdasdsad.com");
        item.setImg3("http://dasdasdasdsad.com");

        int row = itemMapper.addItem(item);
        System.out.println(row);

    }

    @Test
    public void queryItemListByCategoryId(){
        List<Item> items = itemMapper.queryItemListByCategoryId(10);
        System.out.println(items);

    }
}