package com.cloud.spring.study.mysql_service.core;

import com.cloud.spring.study.mysql_service.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperServiceImpl {
    public IUserMapper getiUserMapper() {
        return iUserMapper;
    }

    @Autowired
    private IUserMapper iUserMapper;
}
