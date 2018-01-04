package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallshop;

public interface MallshopMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallshop record);

    int insertSelective(Mallshop record);

    Mallshop selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallshop record);

    int updateByPrimaryKey(Mallshop record);
}