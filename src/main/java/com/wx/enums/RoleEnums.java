package com.wx.enums;

public enum RoleEnums {

    GLY("管理员"),
    PTYH("普通用户");

    private String msg;

    RoleEnums(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
