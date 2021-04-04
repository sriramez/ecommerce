package com.ecom.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecommerce.entity.UserOrder;
import com.ecom.ecommerce.repository.UserOrderRepository;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	UserOrderRepository repo;
	
	@PostMapping
	public UserOrder save(@RequestBody UserOrder order)
	{
		return repo.save(order);
	}
}
