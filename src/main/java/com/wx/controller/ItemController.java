package com.wx.controller;

import com.wx.entity.Item;
import com.wx.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;




    @GetMapping("/queryItemList")
    public List<Item> queryItemList(){
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
        int row = itemService.addItem(item);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }

    @PostMapping("/updateItem")
    public String updateItem(@RequestBody Item item){
        int row = itemService.updateItem(item);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }


}
