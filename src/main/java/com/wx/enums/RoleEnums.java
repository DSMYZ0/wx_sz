package com.wx.enums;

public enum RoleEnums {

    GLY("admin"),
    PTYH("public");

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
