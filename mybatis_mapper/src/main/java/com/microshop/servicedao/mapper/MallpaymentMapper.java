package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Mallpayment;

public interface MallpaymentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallpayment record);

    int insertSelective(Mallpayment record);

    Mallpayment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallpayment record);

    int updateByPrimaryKey(Mallpayment record);
}