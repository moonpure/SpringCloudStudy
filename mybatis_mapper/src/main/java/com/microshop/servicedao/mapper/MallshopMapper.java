package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Mallshop;

public interface MallshopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mallshop
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mallshop
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    int insert(Mallshop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mallshop
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    int insertSelective(Mallshop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mallshop
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    Mallshop selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mallshop
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    int updateByPrimaryKeySelective(Mallshop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mallshop
     *
     * @mbg.generated Tue Dec 26 19:10:23 CST 2017
     */
    int updateByPrimaryKey(Mallshop record);
}