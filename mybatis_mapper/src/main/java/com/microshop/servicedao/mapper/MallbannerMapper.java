package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Mallbanner;

public interface MallbannerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallbanner record);

    int insertSelective(Mallbanner record);

    Mallbanner selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallbanner record);

    int updateByPrimaryKey(Mallbanner record);
}