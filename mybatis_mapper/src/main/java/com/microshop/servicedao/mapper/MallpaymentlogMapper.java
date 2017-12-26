package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Mallpaymentlog;

public interface MallpaymentlogMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallpaymentlog record);

    int insertSelective(Mallpaymentlog record);

    Mallpaymentlog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallpaymentlog record);

    int updateByPrimaryKey(Mallpaymentlog record);
}