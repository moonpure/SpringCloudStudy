package com.microshop.servicedao.dbmodel;

import java.util.Date;

public class Malluser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column malluser.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column malluser.name
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column malluser.nickName
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column malluser.platformId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Integer platformid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column malluser.userType
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Integer usertype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column malluser.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column malluser.id
     *
     * @return the value of malluser.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column malluser.id
     *
     * @param id the value for malluser.id
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column malluser.name
     *
     * @return the value of malluser.name
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column malluser.name
     *
     * @param name the value for malluser.name
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column malluser.nickName
     *
     * @return the value of malluser.nickName
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column malluser.nickName
     *
     * @param nickname the value for malluser.nickName
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column malluser.platformId
     *
     * @return the value of malluser.platformId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Integer getPlatformid() {
        return platformid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column malluser.platformId
     *
     * @param platformid the value for malluser.platformId
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setPlatformid(Integer platformid) {
        this.platformid = platformid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column malluser.userType
     *
     * @return the value of malluser.userType
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Integer getUsertype() {
        return usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column malluser.userType
     *
     * @param usertype the value for malluser.userType
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column malluser.createTime
     *
     * @return the value of malluser.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column malluser.createTime
     *
     * @param createtime the value for malluser.createTime
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}