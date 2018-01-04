package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallgoods;

public interface MallgoodsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallgoods record);

    int insertSelective(Mallgoods record);

    Mallgoods selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallgoods record);

    int updateByPrimaryKey(Mallgoods record);
}