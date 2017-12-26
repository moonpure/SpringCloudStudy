package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Mallaccountpayrecord;

public interface MallaccountpayrecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mallaccountpayrecord record);

    int insertSelective(Mallaccountpayrecord record);

    Mallaccountpayrecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mallaccountpayrecord record);

    int updateByPrimaryKey(Mallaccountpayrecord record);
}