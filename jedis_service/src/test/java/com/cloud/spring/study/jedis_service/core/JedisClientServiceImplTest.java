package com.cloud.spring.study.jedis_service.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JedisClientServiceImplTest {
    @Autowired
    JedisClientServiceImpl jedisClientService;
    @Test
    public void set() throws Exception {
        jedisClientService.set("kkeyt","jedistest");
    }

}