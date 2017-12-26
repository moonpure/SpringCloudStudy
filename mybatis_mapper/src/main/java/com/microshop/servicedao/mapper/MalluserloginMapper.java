package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Malluserlogin;

public interface MalluserloginMapper {
    int deleteByPrimaryKey(String id);

    int insert(Malluserlogin record);

    int insertSelective(Malluserlogin record);

    Malluserlogin selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Malluserlogin record);

    int updateByPrimaryKey(Malluserlogin record);
}