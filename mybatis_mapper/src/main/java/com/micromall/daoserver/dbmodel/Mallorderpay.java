package com.micromall.daoserver.dbmodel;

import java.util.Date;

public class Mallorderpay {
    private String id;

    private String orderid;

    private String shopid;

    private String userid;

    private Integer paytype;

    private Integer payprice;

    private String payflow;

    private String thirdflow;

    private Integer flowstatus;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getPayprice() {
        return payprice;
    }

    public void setPayprice(Integer payprice) {
        this.payprice = payprice;
    }

    public String getPayflow() {
        return payflow;
    }

    public void setPayflow(String payflow) {
        this.payflow = payflow == null ? null : payflow.trim();
    }

    public String getThirdflow() {
        return thirdflow;
    }

    public void setThirdflow(String thirdflow) {
        this.thirdflow = thirdflow == null ? null : thirdflow.trim();
    }

    public Integer getFlowstatus() {
        return flowstatus;
    }

    public void setFlowstatus(Integer flowstatus) {
        this.flowstatus = flowstatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}