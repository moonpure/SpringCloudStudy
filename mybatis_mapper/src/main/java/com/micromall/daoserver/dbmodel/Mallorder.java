package com.micromall.daoserver.dbmodel;

import java.util.Date;

public class Mallorder {
    private String id;

    private String ordercode;

    private String userid;

    private Integer platformid;

    private Integer ordertype;

    private String targetid;

    private String targetname;

    private String targetaddress;

    private String targetphone;

    private Integer standardprice;

    private Integer saleprice;

    private Integer costprice;

    private Integer trafficprice;

    private Integer payprice;

    private Integer flowstatus;

    private Integer state;

    private Date createtime;

    private Date paytime;

    private Date updatetime;

    private String tradingflow;

    private Date deliverytime;

    private Date tradetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode == null ? null : ordercode.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getPlatformid() {
        return platformid;
    }

    public void setPlatformid(Integer platformid) {
        this.platformid = platformid;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public String getTargetid() {
        return targetid;
    }

    public void setTargetid(String targetid) {
        this.targetid = targetid == null ? null : targetid.trim();
    }

    public String getTargetname() {
        return targetname;
    }

    public void setTargetname(String targetname) {
        this.targetname = targetname == null ? null : targetname.trim();
    }

    public String getTargetaddress() {
        return targetaddress;
    }

    public void setTargetaddress(String targetaddress) {
        this.targetaddress = targetaddress == null ? null : targetaddress.trim();
    }

    public String getTargetphone() {
        return targetphone;
    }

    public void setTargetphone(String targetphone) {
        this.targetphone = targetphone == null ? null : targetphone.trim();
    }

    public Integer getStandardprice() {
        return standardprice;
    }

    public void setStandardprice(Integer standardprice) {
        this.standardprice = standardprice;
    }

    public Integer getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Integer saleprice) {
        this.saleprice = saleprice;
    }

    public Integer getCostprice() {
        return costprice;
    }

    public void setCostprice(Integer costprice) {
        this.costprice = costprice;
    }

    public Integer getTrafficprice() {
        return trafficprice;
    }

    public void setTrafficprice(Integer trafficprice) {
        this.trafficprice = trafficprice;
    }

    public Integer getPayprice() {
        return payprice;
    }

    public void setPayprice(Integer payprice) {
        this.payprice = payprice;
    }

    public Integer getFlowstatus() {
        return flowstatus;
    }

    public void setFlowstatus(Integer flowstatus) {
        this.flowstatus = flowstatus;
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

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getTradingflow() {
        return tradingflow;
    }

    public void setTradingflow(String tradingflow) {
        this.tradingflow = tradingflow == null ? null : tradingflow.trim();
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public Date getTradetime() {
        return tradetime;
    }

    public void setTradetime(Date tradetime) {
        this.tradetime = tradetime;
    }
}