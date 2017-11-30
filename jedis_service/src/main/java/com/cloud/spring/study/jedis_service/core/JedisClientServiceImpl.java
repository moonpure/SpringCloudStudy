package com.cloud.spring.study.jedis_service.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class JedisClientServiceImpl {
    @Autowired
   JedisPool jedisPool;
    public void set(String key,String value) {
        Jedis  jedis=jedisPool.getResource();
        jedis.set(key,value);
        if(jedis!=null)
        {
            jedis.close();
        }
    }
    public String get(String key) {
        Jedis  jedis=jedisPool.getResource();
       String value= jedis.get(key);
        if(jedis!=null)
        {
            jedis.close();
        }
        return value;
    }
}
