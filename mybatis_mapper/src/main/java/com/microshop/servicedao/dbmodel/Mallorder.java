package com.microshop.servicedao.dbmodel;

import java.util.Date;

public class Mallorder {
    private String id;

    private String userid;

    private Integer platformid;

    private String targetid;

    private String targetname;

    private String targetphone;

    private Integer standardprice;

    private Integer saleprice;

    private Integer costprice;

    private Integer trafficprice;

    private Integer payprice;

    private Integer flowstatus;

    private Integer state;

    private Date createtime;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}