package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallgoodslog;

public interface MallgoodslogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallgoodslog record);

    int insertSelective(Mallgoodslog record);

    Mallgoodslog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallgoodslog record);

    int updateByPrimaryKey(Mallgoodslog record);
}