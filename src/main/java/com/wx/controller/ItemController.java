package com.wx.controller;

import com.alibaba.fastjson.JSON;
import com.wx.dto.ItemRequest;
import com.wx.dto.ItemResponse;
import com.wx.dto.ResponseResult;
import com.wx.entity.Item;
import com.wx.entity.User;
import com.wx.service.ItemService;
import com.wx.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class ItemController {

    private static final Logger LOGGER  = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;
    @Autowired
    private UserService userService;



    @PostMapping("/queryItemListByUserId")
    public List<Item> queryItemListByUserId(@RequestBody String userId){
        List<Item> items = itemService.queryItemListByUserId(Integer.parseInt(JSON.parseObject(userId, Map.class).get("userId") + ""));
        return items;
    }


    @GetMapping("/queryItemList")
    public ResponseResult queryItemList(){
        ResponseResult result = itemService.queryItemList();
        return result;

    }


    @GetMapping("/queryItemById")
    public ItemResponse queryItemById(Integer id){
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
    public String addItem(@RequestBody ItemRequest request){

        Item item = new Item();
        item.setId(request.getId());
        User user = userService.queryUserByOpenid(request.getUser().getOpenid());
        item.setUser(user);
        item.setCategory(request.getCategory());
        item.setTitle(request.getTitle());
        item.setTime(request.getTime());
        item.setStyle(request.getStyle());
        item.setAreas(request.getAreas());
        item.setAddress(request.getAddress());
        item.setDetailDesc(request.getDetailDesc());
        List<String> imgs = request.getImgs();
        if(imgs!=null && imgs.size()==3){
            item.setImg1(imgs.get(0));
            item.setImg2(imgs.get(1));
            item.setImg3(imgs.get(2));
        }
        if(imgs!=null && imgs.size()==2){
            item.setImg1(imgs.get(0));
            item.setImg2(imgs.get(1));
        }
        if(imgs!=null && imgs.size()==1){
            item.setImg1(imgs.get(0));
        }
        //LOGGER.info("item={}",item);
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
