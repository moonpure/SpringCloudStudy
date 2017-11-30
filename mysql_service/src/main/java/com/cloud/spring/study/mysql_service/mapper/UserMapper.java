package com.cloud.spring.study.mysql_service.mapper;

import com.cloud.spring.study.mysql_service.entity.User;

import java.util.List;

public interface UserMapper {
    User findUserById(Long id);

    List<User> findAllUsers();

    int insertUser(User user);
}
