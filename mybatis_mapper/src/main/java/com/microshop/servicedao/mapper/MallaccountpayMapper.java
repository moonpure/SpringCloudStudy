package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Mallaccountpay;

public interface MallaccountpayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mallaccountpay record);

    int insertSelective(Mallaccountpay record);

    Mallaccountpay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mallaccountpay record);

    int updateByPrimaryKey(Mallaccountpay record);
}