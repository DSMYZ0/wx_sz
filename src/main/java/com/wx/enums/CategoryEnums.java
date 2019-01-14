package com.wx.enums;

public enum CategoryEnums {

    XWQS(1,"寻物启事"),
    XRQS(2,"寻人启事"),
    XCQS(3,"寻宠启示"),
    SWZL(4,"失物招领")
    ;

    private int id;
    private String name;

    CategoryEnums(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
