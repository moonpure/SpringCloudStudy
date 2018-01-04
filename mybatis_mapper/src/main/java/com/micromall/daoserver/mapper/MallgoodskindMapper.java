package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallgoodskind;

public interface MallgoodskindMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallgoodskind record);

    int insertSelective(Mallgoodskind record);

    Mallgoodskind selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallgoodskind record);

    int updateByPrimaryKey(Mallgoodskind record);
}