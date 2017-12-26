package com.microshop.servicedao.dbmodel;

import java.util.Date;

public class Mallshopfee {
    private Integer id;

    private String shopname;

    private String shopid;

    private Integer feemoney;

    private Integer feerate;

    private Integer state;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public Integer getFeemoney() {
        return feemoney;
    }

    public void setFeemoney(Integer feemoney) {
        this.feemoney = feemoney;
    }

    public Integer getFeerate() {
        return feerate;
    }

    public void setFeerate(Integer feerate) {
        this.feerate = feerate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}