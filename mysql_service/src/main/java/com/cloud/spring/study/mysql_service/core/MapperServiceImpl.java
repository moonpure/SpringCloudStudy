package com.cloud.spring.study.mysql_service.core;


import com.cloud.spring.study.mysql_service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperServiceImpl {


    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    private UserMapper userMapper;
}
