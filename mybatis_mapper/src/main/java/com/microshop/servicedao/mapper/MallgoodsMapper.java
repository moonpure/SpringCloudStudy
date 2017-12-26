package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Mallgoods;

public interface MallgoodsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallgoods record);

    int insertSelective(Mallgoods record);

    Mallgoods selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallgoods record);

    int updateByPrimaryKey(Mallgoods record);
}