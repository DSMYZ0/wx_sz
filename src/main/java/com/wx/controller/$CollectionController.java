package com.wx.controller;

import com.alibaba.fastjson.JSON;
import com.wx.entity.$Collection;
import com.wx.service.$CollectionService;
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
public class $CollectionController {

    private static final Logger LOGGER = LoggerFactory.getLogger($CollectionController.class);

    @Autowired
    private $CollectionService collectionService;

    @PostMapping("/queryCollectionByUserId")
    public List<$Collection> queryCollectionByUserId(Integer userId){
        return collectionService.queryCollectionByUserId(userId);
    }

    @PostMapping("/queryCollectionByUserIdAndItemId")
    public List<$Collection> queryCollectionByUserIdAndItemId(@RequestBody Map<String,Integer> map){
        System.out.println(map);
        List<$Collection> collections = collectionService.queryCollectionByUserIdAndItemId(map.get("userid"), map.get("itemid"));
        return collections;
    }

    @GetMapping("/queryCollectionById")
    public $Collection queryCollectionById(Integer id){
        return collectionService.queryCollectionById(id);
    }


    @GetMapping("/deleteCollectionByUserIdAndItemId")
    public String deleteCollectionByUserIdAndItemId(Integer userId,Integer itemId){
        int row = collectionService.deleteCollectionByUserIdAndItemId(userId, itemId);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }

    @PostMapping("/addCollection")
    public String addCollection(Integer userId,Integer itemId){

        LOGGER.info("userId={},itemId={}",userId,itemId);

        int row = collectionService.addCollection(userId, itemId);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }


    @GetMapping("/deleteCollectionById")
    public String deleteCollectionById(Integer id){
        int row = collectionService.deleteCollectionById(id);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }


}
