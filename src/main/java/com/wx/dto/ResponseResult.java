package com.wx.dto;

public class ResponseResult {

    private Object xw;
    private Object xr;
    private Object xc;
    private Object sz;

    public ResponseResult() {
    }

    public Object getXw() {
        return xw;
    }

    public void setXw(Object xw) {
        this.xw = xw;
    }

    public Object getXr() {
        return xr;
    }

    public void setXr(Object xr) {
        this.xr = xr;
    }

    public Object getXc() {
        return xc;
    }

    public void setXc(Object xc) {
        this.xc = xc;
    }

    public Object getSz() {
        return sz;
    }

    public void setSz(Object sz) {
        this.sz = sz;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "xw=" + xw +
                ", xr=" + xr +
                ", xc=" + xc +
                ", sz=" + sz +
                '}';
    }
}
