package com.wx.dto;

import com.wx.entity.Category;
import com.wx.entity.User;

import java.util.List;

public class ItemRequest {

    private Integer id;
    private User user;
    private Category category;
    private String title;
    private String time;
    private String style;
    private String areas;
    private String address;
    private String detailDesc;
    private List<String> imgs;

    public ItemRequest() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "ItemRequest{" +
                "id=" + id +
                ", user=" + user +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", style='" + style + '\'' +
                ", areas='" + areas + '\'' +
                ", address='" + address + '\'' +
                ", detailDesc='" + detailDesc + '\'' +
                ", imgs=" + imgs +
                '}';
    }
}
