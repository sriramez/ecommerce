package com.ecom.ecommerce.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiscountRedis {

	@Bean
	public Map<Long, String> tokenStore()
	{
		return new HashMap<>();
	}
}
