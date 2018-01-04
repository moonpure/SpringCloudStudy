package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Malluser;

public interface MalluserMapper {
    int deleteByPrimaryKey(String id);

    int insert(Malluser record);

    int insertSelective(Malluser record);

    Malluser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Malluser record);

    int updateByPrimaryKey(Malluser record);
}