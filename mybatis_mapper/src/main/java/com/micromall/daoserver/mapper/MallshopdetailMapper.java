package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallshopdetail;

public interface MallshopdetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallshopdetail record);

    int insertSelective(Mallshopdetail record);

    Mallshopdetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallshopdetail record);

    int updateByPrimaryKey(Mallshopdetail record);
}