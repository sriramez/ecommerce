package com.ecom.ecommerce.service;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecommerce.auth.JwtUtil;
import com.ecom.ecommerce.auth.UserLogin;
import com.ecom.ecommerce.entity.User;
import com.ecom.ecommerce.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	Map<Long, String> tokenStore;
	
	@SuppressWarnings("unchecked")
	public UserLogin login(String username,String password)
	{
		UserLogin user = new UserLogin();
		User userentity = userRepository.findByUsernameAndPassword(username, password);
		if(userentity !=null)
		{
			String Token = JwtUtil.createJWT(String.valueOf(userentity.getId()),userentity.getUsername() ,userentity.getUsername(), Long.valueOf(900000));
			user.setId(userentity.getId());
			user.setUsername(username);
			user.setAuthToken(Token);
			user.setStatus("login success");
			tokenStore.put(user.getId(), user.getAuthToken());
		}
		else
		{
			user.setStatus("login failed");
		}
		return user;
	}
}
