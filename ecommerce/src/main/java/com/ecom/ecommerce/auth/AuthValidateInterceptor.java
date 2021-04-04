package com.ecom.ecommerce.auth;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


import io.jsonwebtoken.Claims;

@Component
public class AuthValidateInterceptor implements HandlerInterceptor {

	@Autowired
	Map<Long, String> tokenStore;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		/*
		 * String AuthToken = request.getHeader("x-auth-token"); Long userId =
		 * Long.valueOf(request.getHeader("userId")); if (AuthToken != null &&
		 * !AuthToken.isEmpty()) { Claims claims = JwtUtil.decodeJWT(AuthToken); String
		 * token = null; if(claims.getId().equals(String.valueOf(userId))) { token =
		 * tokenStore.get(Long.valueOf(claims.getId())); } if (token == null ||
		 * token.isEmpty()) { throw new Exception("JWT token is invalid or expired"); }
		 * else if(!token.equals(AuthToken)) { throw new
		 * Exception("Authtoken is invalid"); } } else { throw new
		 * Exception("please Login and try again"); }
		 */
		return true;
	}
}
