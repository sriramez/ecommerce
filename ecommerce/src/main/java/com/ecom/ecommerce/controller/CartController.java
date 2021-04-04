package com.ecom.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecommerce.entity.UserCartDetails;
import com.ecom.ecommerce.entity.UserCarts;
import com.ecom.ecommerce.repository.CartDetailsRepository;
import com.ecom.ecommerce.service.UserCartsService;
import com.ecom.ecommerce.service.UserService;

@RequestMapping("/cart")
@RestController
public class CartController {

	@Autowired
	UserCartsService service;
	
	@Autowired
	UserService userService;
	@PostMapping
	public UserCarts createCart(@RequestBody UserCarts carts)
	{
		return service.addNewUserCart(carts);
	}
	
	@GetMapping
	public UserCarts getCart(@RequestParam Long cartId)
	{
		return service.getCart(cartId);
	}
	
	@DeleteMapping
	public Long deleteCart(@RequestParam Long cartId)
	{
		return service.delete(cartId);
	}
}
