package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallshopfee;

public interface MallshopfeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mallshopfee record);

    int insertSelective(Mallshopfee record);

    Mallshopfee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mallshopfee record);

    int updateByPrimaryKey(Mallshopfee record);
}