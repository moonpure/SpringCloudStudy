package com.microshop.servicedao.dbmodel;

import java.util.Date;

public class Mallcategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.Name
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.parentId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Integer parentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.logoUrl
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String logourl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.grade
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Integer grade;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.sort
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.userName
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.userId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.state
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.remark
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mallcategory.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.id
     *
     * @return the value of mallcategory.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.id
     *
     * @param id the value for mallcategory.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.Name
     *
     * @return the value of mallcategory.Name
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.Name
     *
     * @param name the value for mallcategory.Name
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.parentId
     *
     * @return the value of mallcategory.parentId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.parentId
     *
     * @param parentid the value for mallcategory.parentId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.logoUrl
     *
     * @return the value of mallcategory.logoUrl
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getLogourl() {
        return logourl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.logoUrl
     *
     * @param logourl the value for mallcategory.logoUrl
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.grade
     *
     * @return the value of mallcategory.grade
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.grade
     *
     * @param grade the value for mallcategory.grade
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.sort
     *
     * @return the value of mallcategory.sort
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.sort
     *
     * @param sort the value for mallcategory.sort
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.userName
     *
     * @return the value of mallcategory.userName
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.userName
     *
     * @param username the value for mallcategory.userName
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.userId
     *
     * @return the value of mallcategory.userId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.userId
     *
     * @param userid the value for mallcategory.userId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.state
     *
     * @return the value of mallcategory.state
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.state
     *
     * @param state the value for mallcategory.state
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.remark
     *
     * @return the value of mallcategory.remark
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.remark
     *
     * @param remark the value for mallcategory.remark
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mallcategory.createTime
     *
     * @return the value of mallcategory.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mallcategory.createTime
     *
     * @param createtime the value for mallcategory.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}