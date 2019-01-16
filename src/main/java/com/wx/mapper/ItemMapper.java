package com.wx.mapper;

import com.wx.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ItemMapper {

    /**
     * 添加项目
     * @param item
     * @return
     */
    int addItem(Item item);

    /**
     * 更新项目
     * @param item
     * @return
     */
    int updateItem(Item item);

    /**
     * 删除项目
     * @param id
     * @return
     */
    int deleteItem(Integer id);

    /**
     * 获取项目
     * @param id
     * @return
     */
    Item queryItemById(Integer id);

    /**
     * 获取列表
     * @return
     */
    List<Item> queryItemList();

    /**
     * 通过分类获取列表
     */
    List<Item> queryItemListByCategoryId(Integer categoryId);
}
