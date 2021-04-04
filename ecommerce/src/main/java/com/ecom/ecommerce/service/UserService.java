package com.ecom.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecommerce.entity.User;
import com.ecom.ecommerce.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public User createUser(User user)
	{
		return repo.save(user);
		
	}
	
	
	public User getUser(String userId)
	{
		Optional<User> user = repo.findById(Long.valueOf(userId));
		if(user.get()!=null)
		return user.get();
		else return null;
	}
	
	
	public User updateUser(User user)
	{
		return repo.save(user);
	}
	
	public User disableUser(String userId)
	{
		Optional<User> user = repo.findById(Long.valueOf(userId));
		if(user.get()!=null)
		{
			User retUser = user.get();
			retUser.setActive(false);
			return repo.save(retUser);
		}
		return null;
		
	}
	
	public void deleteUser(String userId)
	{
		 repo.deleteById(Long.valueOf(userId));
	}
	
}
