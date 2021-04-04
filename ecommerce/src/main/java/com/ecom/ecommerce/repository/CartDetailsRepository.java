package com.ecom.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecom.ecommerce.entity.UserCartDetails;

public interface CartDetailsRepository extends CrudRepository<UserCartDetails, Long> {
	//List<UserCartDetails> findByCartId(long cartId); 
}
