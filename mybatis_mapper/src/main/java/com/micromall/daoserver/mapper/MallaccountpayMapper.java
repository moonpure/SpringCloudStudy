package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallaccountpay;

public interface MallaccountpayMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallaccountpay record);

    int insertSelective(Mallaccountpay record);

    Mallaccountpay selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallaccountpay record);

    int updateByPrimaryKey(Mallaccountpay record);
}