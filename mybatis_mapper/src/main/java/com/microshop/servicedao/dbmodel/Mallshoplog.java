package com.microshop.servicedao.dbmodel;

import java.util.Date;

public class Mallshoplog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallshoplog.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallshoplog.shopId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String shopid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallshoplog.content
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallshoplog.userId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallshoplog.flowStatus
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Integer flowstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallshoplog.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallshoplog.id
     *
     * @return the value of mallshoplog.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallshoplog.id
     *
     * @param id the value for mallshoplog.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallshoplog.shopId
     *
     * @return the value of mallshoplog.shopId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getShopid() {
        return shopid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallshoplog.shopId
     *
     * @param shopid the value for mallshoplog.shopId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallshoplog.content
     *
     * @return the value of mallshoplog.content
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallshoplog.content
     *
     * @param content the value for mallshoplog.content
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallshoplog.userId
     *
     * @return the value of mallshoplog.userId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallshoplog.userId
     *
     * @param userid the value for mallshoplog.userId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallshoplog.flowStatus
     *
     * @return the value of mallshoplog.flowStatus
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Integer getFlowstatus() {
        return flowstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallshoplog.flowStatus
     *
     * @param flowstatus the value for mallshoplog.flowStatus
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setFlowstatus(Integer flowstatus) {
        this.flowstatus = flowstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallshoplog.createTime
     *
     * @return the value of mallshoplog.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallshoplog.createTime
     *
     * @param createtime the value for mallshoplog.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}