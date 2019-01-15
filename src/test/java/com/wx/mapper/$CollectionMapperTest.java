package com.wx.mapper;

import com.wx.WxSzApplicationTests;
import com.wx.entity.$Collection;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    @Test
    public void queryCollectionByUserId(){
        List<$Collection> collections = collectionMapper.queryCollectionByUserId(11);
        System.out.println(collections);
    }

    @Test
    public void queryCollectionById(){
        $Collection collections = collectionMapper.queryCollectionById(1);
        System.out.println(collections);
    }


}