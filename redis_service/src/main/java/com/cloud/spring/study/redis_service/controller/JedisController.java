package com.cloud.spring.study.redis_service.controller;

import com.cloud.spring.study.redis_service.core.RedisClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JedisController {
    @Autowired
    RedisClientServiceImpl redisClientService;
    public String getjedis()
    {
        redisClientService.set("testk","valuekey");
        return redisClientService.get("testk");
    }
}
