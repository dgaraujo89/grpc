package com.github.diegogomesaraujo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

@Configuration
@SpringBootApplication
public class SpringBootServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServerApplication.class, args);
	}
	
//	@Bean
//	public JedisConnectionFactory jedisConnectionFactory() {
//	    return new JedisConnectionFactory();
//	}
//	
//	@Bean
//	public RedisTemplate<String, Object> redisTemplate() {
//	    final RedisTemplate<String, Object> template = new RedisTemplate<>();
//	    template.setConnectionFactory(jedisConnectionFactory());
//	    template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
//	    return template;
//	}

}
