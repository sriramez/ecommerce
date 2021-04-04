package com.ecom.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecommerce.entity.Address;
import com.ecom.ecommerce.entity.User;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long>{
	/*
	 * Address findByUserIdAndIsActiveAndIsDefaultBillingAddress(long userId,
	 * boolean isActive, boolean isDefaultAddress); Address
	 * findByUserIdAndIsActiveAndIsDefaultShippingAddress(long userId, boolean
	 * isActive, boolean isDefaultShipping); List<Address>
	 * findByUserIdAndIsActive(Long userId, boolean isActive);
	 */
	List<Address> findByUserAndIsActive(User user, boolean isActive);
	Address findByUserAndIsActiveAndIsDefaultBillingAddress(User user, boolean isActive, boolean isDefaultBillingAddress);
	Address findByUserAndIsActiveAndIsDefaultShippingAddress(User user, boolean isActive, boolean isDefaultShippingAddress);
}
