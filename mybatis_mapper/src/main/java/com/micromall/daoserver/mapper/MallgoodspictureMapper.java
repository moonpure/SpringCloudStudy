package com.micromall.daoserver.mapper;

import com.micromall.daoserver.dbmodel.Mallgoodspicture;

public interface MallgoodspictureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Mallgoodspicture record);

    int insertSelective(Mallgoodspicture record);

    Mallgoodspicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mallgoodspicture record);

    int updateByPrimaryKey(Mallgoodspicture record);
}