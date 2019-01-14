package com.wx.mapper;

import com.wx.WxSzApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class $CollectionMapperTest extends WxSzApplicationTests {

    @Autowired
    private $CollectionMapper collectionMapper;

    @Test
    public void addCollection(){
        int row = collectionMapper.addCollection(11, 10);
        System.out.println(row);
    }

    @Test
    public void deleteCollectionById(){
        collectionMapper.deleteCollectionById(11);
    }

    @Test
    public void deleteCollectionByUserIdAndItemId(){
        collectionMapper.deleteCollectionByUserIdAndItemId(11,10);
    }

}