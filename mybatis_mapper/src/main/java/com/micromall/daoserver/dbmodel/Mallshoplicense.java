package com.micromall.daoserver.dbmodel;

import java.util.Date;

public class Mallshoplicense {
    private Long id;

    private String shopid;

    private Integer licensetype;

    private String licenseurl;

    private Integer state;

    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public Integer getLicensetype() {
        return licensetype;
    }

    public void setLicensetype(Integer licensetype) {
        this.licensetype = licensetype;
    }

    public String getLicenseurl() {
        return licenseurl;
    }

    public void setLicenseurl(String licenseurl) {
        this.licenseurl = licenseurl == null ? null : licenseurl.trim();
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