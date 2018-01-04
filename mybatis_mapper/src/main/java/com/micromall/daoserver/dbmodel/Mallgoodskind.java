package com.micromall.daoserver.dbmodel;

import java.util.Date;

public class Mallgoodskind {
    private String id;

    private String sku;

    private String goodsname;

    private String goodsid;

    private String keywords;

    private String shopid;

    private String shopname;

    private String brandname;

    private String thirdcategoryid;

    private String secondcategoryid;

    private String firstcategoryid;

    private String categoryname;

    private String logourl;

    private String name;

    private Integer standardprice;

    private Integer saleprice;

    private Integer costprice;

    private Integer trafficprice;

    private Integer traffictype;

    private Integer stock;

    private Integer version;

    private Integer tempstock;

    private Integer flowstatus;

    private Integer state;

    private Integer tempversion;

    private Date createtime;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getThirdcategoryid() {
        return thirdcategoryid;
    }

    public void setThirdcategoryid(String thirdcategoryid) {
        this.thirdcategoryid = thirdcategoryid == null ? null : thirdcategoryid.trim();
    }

    public String getSecondcategoryid() {
        return secondcategoryid;
    }

    public void setSecondcategoryid(String secondcategoryid) {
        this.secondcategoryid = secondcategoryid == null ? null : secondcategoryid.trim();
    }

    public String getFirstcategoryid() {
        return firstcategoryid;
    }

    public void setFirstcategoryid(String firstcategoryid) {
        this.firstcategoryid = firstcategoryid == null ? null : firstcategoryid.trim();
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getTraffictype() {
        return traffictype;
    }

    public void setTraffictype(Integer traffictype) {
        this.traffictype = traffictype;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getTempstock() {
        return tempstock;
    }

    public void setTempstock(Integer tempstock) {
        this.tempstock = tempstock;
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

    public Integer getTempversion() {
        return tempversion;
    }

    public void setTempversion(Integer tempversion) {
        this.tempversion = tempversion;
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