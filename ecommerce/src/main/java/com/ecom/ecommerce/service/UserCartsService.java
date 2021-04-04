package com.ecom.ecommerce.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecommerce.entity.UserCartDetails;
import com.ecom.ecommerce.entity.UserCarts;
import com.ecom.ecommerce.repository.CartDetailsRepository;
import com.ecom.ecommerce.repository.UserCartsRepository;

@Service

public class UserCartsService {
	@Autowired UserCartsRepository cartsRepo;
	@Autowired CartDetailsRepository cartDetailsRepo;
	
	public void deleteUserCart(String cartId) {
		cartsRepo.deleteById(Long.valueOf(cartId));
	}
	
	public UserCarts addNewUserCart(UserCarts carts) {
		
		return cartsRepo.save(carts);
	}
	
	public UserCarts getCart(Long cartId)
	{
		Optional<UserCarts> cart = cartsRepo.findById(cartId);
		if(cart.get()!=null)
		return cart.get();
		else
			return null;
	}
	
	public Long delete(Long cartId)
	{
		cartsRepo.deleteById(cartId);
		return cartId;
	}
}
