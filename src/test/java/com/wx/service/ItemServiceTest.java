package com.wx.service;

import com.wx.WxSzApplicationTests;
import com.wx.dto.ResponseResult;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @Auther: hushuang
 * @Date: 2019/1/19 19:49
 * @Description:
 */
public class ItemServiceTest extends WxSzApplicationTests {

    @Autowired
    private ItemService itemService;

    @Test
    public void queryItemList() {

        ResponseResult itemList = itemService.queryItemList(2, 2);
        System.out.println(itemList);


    }
}