package com.ecom.ecommerce.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class AuthValidateInterceptorAppConfig implements WebMvcConfigurer{

	@Autowired
	AuthValidateInterceptor authValidateInterceptor;
	
	 @Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      List<String> patterns = new ArrayList<String>();
	      patterns.add("/user/**");
	      List<String> excludePatterns = new ArrayList<String>();
	      excludePatterns.add("/user/save");
		registry.addInterceptor(authValidateInterceptor).excludePathPatterns(excludePatterns).addPathPatterns(patterns);
	   }
}
