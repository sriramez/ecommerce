package com.ecom.ecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecommerce.auth.JwtUtil;
import com.ecom.ecommerce.auth.UserLogin;
import com.ecom.ecommerce.service.LoginService;

import io.jsonwebtoken.Claims;

@RestController
@RequestMapping("auth")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("login")
	public UserLogin login(@RequestParam String username,@RequestParam String password)
	{
		return loginService.login(username, password);
	}
	
	@GetMapping("validate")
	public Claims validate(@RequestParam String token)
	{
		return JwtUtil.decodeJWT(token);
	}

}
