package com.wx.entity;

/**
 * 收藏表
 */
public class $Collection {
    private Integer id;
    private User user;
    private Item item;

    public $Collection() {
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "$Collection{" +
                "id=" + id +
                ", user=" + user +
                ", item=" + item +
                '}';
    }
}
