package com.wx.controller;

import com.wx.dto.ResponseResult;
import com.wx.entity.Item;
import com.wx.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController {

    private static final Logger LOGGER  = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;



    @GetMapping("/queryItemList")
    public ResponseResult queryItemList(){
        return itemService.queryItemList();

    }


    @GetMapping("/queryItemById")
    public Item queryItemById(Integer id){
        return itemService.queryItemById(id);

    }

    @GetMapping("/deleteItem")
    public String deleteItem(Integer id){

        int row = itemService.deleteItem(id);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }

    }


    @PostMapping("/addItem")
    public String addItem(@RequestBody Item item){
        LOGGER.info("item={}",item);
        int row = itemService.addItem(item);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }

    @PostMapping("/updateItem")
    public String updateItem(@RequestBody Item item){
        LOGGER.info("item={}",item);
        int row = itemService.updateItem(item);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }


}
