package com.ecom.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecommerce.entity.UserOrder;
import com.ecom.ecommerce.repository.UserOrderRepository;

@Service
public class UserOrderService {

	@Autowired
	UserOrderRepository orderRepository;
	
	public UserOrder createUserOrder(UserOrder userOrder)
	{
		return orderRepository.save(userOrder);
	}
	
	public UserOrder getUserOrder(String orderId)
	{
		Optional<UserOrder> order =  orderRepository.findById(Long.valueOf(orderId));
		if(order.get()!=null)
			return order.get();
		else
			return null;
	}
	
	public UserOrder updateUser(UserOrder userOrder)
	{
		return orderRepository.save(userOrder);
	}
	
	public UserOrder disableOrder(String orderId)
	{
		Optional<UserOrder> order =  orderRepository.findById(Long.valueOf(orderId));
		if(order.get()!=null)
		{
			UserOrder retOrder = order.get();
			retOrder.setActive(false);
			return orderRepository.save(retOrder);
		}
		else
		{
			return null;
		}
	}
	
	public void deleteOrder(String orderId)
	{
		orderRepository.deleteById(Long.valueOf(orderId));
	}
}
