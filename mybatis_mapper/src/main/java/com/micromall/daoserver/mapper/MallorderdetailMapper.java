package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallorderdetail;

public interface MallorderdetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallorderdetail record);

    int insertSelective(Mallorderdetail record);

    Mallorderdetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallorderdetail record);

    int updateByPrimaryKey(Mallorderdetail record);
}