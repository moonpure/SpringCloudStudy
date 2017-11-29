package com.cloud.spring.study.mysql_service.dao;



import com.cloud.spring.study.mysql_service.entity.User;

import java.util.List;

/**
 * 简单用户链接Mysql数据库微服务（通过@Repository注解标注该类为持久化操作对象）。
 *
 * @author hmilyylimh
 *
 * @version 0.0.1
 *
 * @date 2017-10-19
 *
 */
public interface IUserDao {

    User findUserById(Long id);

    List<User> findAllUsers();

    int insertUser(User user);
}