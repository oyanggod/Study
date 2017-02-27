package com.oy.redis;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oy.utils.JedisUtil;

import redis.clients.jedis.Jedis;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RedisTest {
	private static final Jedis jedis = new Jedis("192.168.92.128", 6379);
	
//	@Test
	public void testOperation(){
		System.out.println(jedis.ping());
		String s = jedis.flushDB();
		System.out.println("清空后："+s);
		
		System.out.println(jedis.echo("hello"));
		jedis.set("hello", "world");
		boolean is = jedis.exists(s);
		System.out.println("hello是否存在："+is);
		
		Set<String> allKeySet = jedis.keys("*");
		System.out.println("数据库中所有的keys："+allKeySet);
		
		String helloType = jedis.type("hello");
		System.out.println("hello的类型是："+helloType);
		
		jedis.del("hello");
	}
	
	@Test
	public void testString(){
		Jedis jedis = JedisUtil.getInstance().getJedis("192.168.92.128", 6379);
		String code = jedis.set("haha", "qqqq");
		System.out.println("code:"+code);
		
		System.out.println(jedis.get("haha"));
	}
	
	
}
