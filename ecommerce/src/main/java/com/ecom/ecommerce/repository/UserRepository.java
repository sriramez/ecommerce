package com.ecom.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecommerce.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long >{

	User findByUsername(String username);
	
	User findByUsernameAndPassword(String username,String password);
	
	
}
