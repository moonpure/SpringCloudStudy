package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Malluseraddress;

public interface MalluseraddressMapper {
    int deleteByPrimaryKey(String id);

    int insert(Malluseraddress record);

    int insertSelective(Malluseraddress record);

    Malluseraddress selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Malluseraddress record);

    int updateByPrimaryKey(Malluseraddress record);
}