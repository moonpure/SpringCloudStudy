package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallcategory;

public interface MallcategoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallcategory record);

    int insertSelective(Mallcategory record);

    Mallcategory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallcategory record);

    int updateByPrimaryKey(Mallcategory record);
}