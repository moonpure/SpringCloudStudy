package com.microshop.servicedao.dbmodel;

import java.util.Date;

public class Mallbannerdetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallbannerdetail.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallbannerdetail.bannerId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String bannerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallbannerdetail.relationId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String relationid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallbannerdetail.sort
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallbannerdetail.typeId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Integer typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallbannerdetail.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallbannerdetail.id
     *
     * @return the value of mallbannerdetail.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallbannerdetail.id
     *
     * @param id the value for mallbannerdetail.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallbannerdetail.bannerId
     *
     * @return the value of mallbannerdetail.bannerId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getBannerid() {
        return bannerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallbannerdetail.bannerId
     *
     * @param bannerid the value for mallbannerdetail.bannerId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setBannerid(String bannerid) {
        this.bannerid = bannerid == null ? null : bannerid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallbannerdetail.relationId
     *
     * @return the value of mallbannerdetail.relationId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getRelationid() {
        return relationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallbannerdetail.relationId
     *
     * @param relationid the value for mallbannerdetail.relationId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setRelationid(String relationid) {
        this.relationid = relationid == null ? null : relationid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallbannerdetail.sort
     *
     * @return the value of mallbannerdetail.sort
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallbannerdetail.sort
     *
     * @param sort the value for mallbannerdetail.sort
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallbannerdetail.typeId
     *
     * @return the value of mallbannerdetail.typeId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallbannerdetail.typeId
     *
     * @param typeid the value for mallbannerdetail.typeId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallbannerdetail.createTime
     *
     * @return the value of mallbannerdetail.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallbannerdetail.createTime
     *
     * @param createtime the value for mallbannerdetail.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}