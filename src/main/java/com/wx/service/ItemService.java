package com.wx.service;

import com.wx.entity.Item;
import com.wx.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemMapper itemMapper;


    @Transactional
    public int addItem(Item item){

        return itemMapper.addItem(item);

    }

    @Transactional
    public int updateItem(Item item){
        return itemMapper.updateItem(item);

    }

    @Transactional
    public int deleteItem(Integer id){

        return itemMapper.deleteItem(id);

    }

    @Transactional
    public Item queryItemById(Integer id){

        return itemMapper.queryItemById(id);

    }

    @Transactional
    public List<Item> queryItemList(){

        return itemMapper.queryItemList();

    }
}
