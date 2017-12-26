package com.microshop.servicedao.dbmodel;

import java.util.Date;

public class Mallgoods {
    private String id;

    private String name;

    private String brandname;

    private String shopid;

    private Integer firstcategoryid;

    private Integer secondcategoryid;

    private String categoryname;

    private Integer thirdcategoryid;

    private String title;

    private Integer standardprice;

    private Integer saleprice;

    private Integer costprice;

    private String keywords;

    private String logourl;

    private String remark;

    private Integer flowstatus;

    private Integer saletotal;

    private Integer state;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public Integer getFirstcategoryid() {
        return firstcategoryid;
    }

    public void setFirstcategoryid(Integer firstcategoryid) {
        this.firstcategoryid = firstcategoryid;
    }

    public Integer getSecondcategoryid() {
        return secondcategoryid;
    }

    public void setSecondcategoryid(Integer secondcategoryid) {
        this.secondcategoryid = secondcategoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public Integer getThirdcategoryid() {
        return thirdcategoryid;
    }

    public void setThirdcategoryid(Integer thirdcategoryid) {
        this.thirdcategoryid = thirdcategoryid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getFlowstatus() {
        return flowstatus;
    }

    public void setFlowstatus(Integer flowstatus) {
        this.flowstatus = flowstatus;
    }

    public Integer getSaletotal() {
        return saletotal;
    }

    public void setSaletotal(Integer saletotal) {
        this.saletotal = saletotal;
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