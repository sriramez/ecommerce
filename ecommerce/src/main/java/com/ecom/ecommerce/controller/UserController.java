package com.ecom.ecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecommerce.entity.User;
import com.ecom.ecommerce.entity.UserCarts;
import com.ecom.ecommerce.service.AddressService;
import com.ecom.ecommerce.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	AddressService addressService;
	
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user)
	{	
		return userService.createUser(user);
	}
	
	@GetMapping("/get/{userId}")
	public User getUser(@RequestHeader("userId") String userId,@RequestHeader("x-auth-token") String authtoken)
	{
		return userService.getUser(userId);
	}
	
	@PutMapping("/put")
	public User updateUser(@RequestHeader("userId") String userId,@RequestHeader("x-auth-token")String authtoken,@RequestBody User user)
	{
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/disable")
	public User disableUser(@RequestHeader("userId") String userId,@RequestHeader("x-auth-token") String authtoken)
	{
		return userService.disableUser(userId);
	}
	
	@DeleteMapping("/delete")
	public boolean deleteUser(@RequestHeader("userId") String userId,@RequestHeader("x-auth-token") String authtoken)
	{
		userService.deleteUser(userId);
		return true;
	}
	
}
