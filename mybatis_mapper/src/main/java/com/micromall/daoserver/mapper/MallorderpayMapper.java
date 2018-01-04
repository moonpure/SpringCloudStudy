package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallorderpay;

public interface MallorderpayMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallorderpay record);

    int insertSelective(Mallorderpay record);

    Mallorderpay selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallorderpay record);

    int updateByPrimaryKey(Mallorderpay record);
}