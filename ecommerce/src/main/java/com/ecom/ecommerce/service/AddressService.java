package com.ecom.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecommerce.entity.Address;
import com.ecom.ecommerce.entity.User;
import com.ecom.ecommerce.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository repo;

	public Address createUpdateAddress(Address address) {
		return repo.save(address);
	}

	public List<Address> getAllUserAddresses(long userId) {
		return (List) repo.findByUserAndIsActive(getUser(userId), true);
	}

	public Address getUserDefaultBillingAddress(long userId) {
		return repo.findByUserAndIsActiveAndIsDefaultBillingAddress(getUser(userId), true, true);
	}

	public Address getUserDefaultShippingAddress(long userId) {
		return repo.findByUserAndIsActiveAndIsDefaultShippingAddress(getUser(userId), true, true);
	}

	private User getUser(long userId) {
		User user = new User();
		user.setId(userId);
		return user;
	}
}
