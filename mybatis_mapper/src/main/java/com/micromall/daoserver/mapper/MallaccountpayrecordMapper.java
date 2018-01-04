package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallaccountpayrecord;

public interface MallaccountpayrecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallaccountpayrecord record);

    int insertSelective(Mallaccountpayrecord record);

    Mallaccountpayrecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallaccountpayrecord record);

    int updateByPrimaryKey(Mallaccountpayrecord record);
}