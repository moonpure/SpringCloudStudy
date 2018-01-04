package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Malluseraddress;

public interface MalluseraddressMapper {
    int deleteByPrimaryKey(String id);

    int insert(Malluseraddress record);

    int insertSelective(Malluseraddress record);

    Malluseraddress selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Malluseraddress record);

    int updateByPrimaryKey(Malluseraddress record);
}