package com.wx.service;

import com.wx.mapper.$CollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("collectionMapper")
public class $CollectionService {

    @Autowired
    private $CollectionMapper collectionMapper;


    @Transactional
    public int addCollection(Integer userId,Integer itemId){
        return collectionMapper.addCollection(userId,itemId);

    }

    @Transactional
    public int deleteCollectionById(Integer collectionId){
        return collectionMapper.deleteCollectionById(collectionId);
    }

    @Transactional
    public int deleteCollectionByUserIdAndItemId(Integer userId,Integer itemId){
        return collectionMapper.deleteCollectionByUserIdAndItemId(userId,itemId);
    }
}
