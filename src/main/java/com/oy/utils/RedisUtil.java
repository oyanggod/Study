package com.oy.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
	private static RedisUtil redisUtil = null;
	private static JedisPool jedisPool = null;

	private RedisUtil() {
		if (jedisPool == null) {
			jedisPool = initPool();
		}
	}

	private JedisPool initPool() {
		JedisPoolConfig config = new JedisPoolConfig();
		// config.setMaxActive(20);
		// config.setMaxIdle(5);
		// config.setMaxWait(1000l);
		// config.setTestOnBorrow(false);
		JedisPool jedisPool = new JedisPool(config, "192.168.92.128", 6379);
		return jedisPool;
	}

	public static RedisUtil getInstance() {
		if (redisUtil == null) {
			redisUtil = new RedisUtil();
		}
		return redisUtil;
	}
	
	public String set(String name, String value){
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return jedis.set(name, value);
	}
}
