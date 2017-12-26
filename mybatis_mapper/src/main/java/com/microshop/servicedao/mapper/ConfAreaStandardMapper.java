package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.ConfAreaStandard;

public interface ConfAreaStandardMapper {
    int deleteByPrimaryKey(Integer areaId);

    int insert(ConfAreaStandard record);

    int insertSelective(ConfAreaStandard record);

    ConfAreaStandard selectByPrimaryKey(Integer areaId);

    int updateByPrimaryKeySelective(ConfAreaStandard record);

    int updateByPrimaryKey(ConfAreaStandard record);
}