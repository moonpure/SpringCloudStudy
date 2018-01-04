package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallbannerdetail;

public interface MallbannerdetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallbannerdetail record);

    int insertSelective(Mallbannerdetail record);

    Mallbannerdetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallbannerdetail record);

    int updateByPrimaryKey(Mallbannerdetail record);
}