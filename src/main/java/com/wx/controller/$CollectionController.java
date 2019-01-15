package com.wx.controller;

import com.wx.service.$CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class $CollectionController {

    @Autowired
    private $CollectionService collectionService;

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
        int row = collectionService.addCollection(userId, itemId);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }


    @GetMapping("/deleteCollectionById")
    public String deleteCollectionById(Integer collectionId){
        int row = collectionService.deleteCollectionById(collectionId);
        if(row>0){
            return "ok";
        }else {
            return "fail";
        }
    }


}
