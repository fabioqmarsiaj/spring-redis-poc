package com.fabioqmarsiaj.spring_redis_poc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@Profile("docker")
public class RedisConfig {

	public JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}

	public RedisTemplate<String, String> redisTemplate(){
		RedisTemplate<String, String> template = new RedisTemplate<>();
		template.setConnectionFactory(jedisConnectionFactory());
		return template;
	}
}
