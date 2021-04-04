package com.ecom.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecommerce.entity.UserCarts;

@Repository
public interface UserCartsRepository extends CrudRepository<UserCarts, Long>{
	//List<UserCarts> findByUserId(long userId);
}
