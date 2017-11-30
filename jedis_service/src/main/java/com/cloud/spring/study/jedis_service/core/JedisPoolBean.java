package com.cloud.spring.study.jedis_service.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class JedisPoolBean {
    @Autowired
    JedisConnectionFactory jedisConnectionFactory;
    @Bean
    public JedisPool redisPoolFactory() {
        JedisPoolConfig jedisPoolConfig = jedisConnectionFactory.getPoolConfig();
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, jedisConnectionFactory.getHostName(), jedisConnectionFactory.getPort(), jedisConnectionFactory.getTimeout());
        return jedisPool;
    }
}
