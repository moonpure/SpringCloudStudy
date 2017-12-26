package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Mallshop;

public interface MallshopMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallshop record);

    int insertSelective(Mallshop record);

    Mallshop selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallshop record);

    int updateByPrimaryKey(Mallshop record);
}