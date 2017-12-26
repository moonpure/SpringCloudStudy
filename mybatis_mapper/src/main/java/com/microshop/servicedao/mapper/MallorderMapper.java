package com.microshop.servicedao.mapper;

import com.microshop.servicedao.dbmodel.Mallorder;

public interface MallorderMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallorder record);

    int insertSelective(Mallorder record);

    Mallorder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallorder record);

    int updateByPrimaryKey(Mallorder record);
}