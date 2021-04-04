package com.ecom.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecom.ecommerce.entity.Billing;
import com.ecom.ecommerce.repository.UserBillingRepository;

public class UserBillingService {

	@Autowired
	UserBillingRepository repo;
	
	public Billing createUserBill(Billing userBill)
	{
		return repo.save(userBill);
	}
	
	public Billing getUserBilling(String orderId)
	{
		Optional<Billing> bill =  repo.findById(Long.valueOf(orderId));
		if(bill.get()!=null)
			return bill.get();
		else
			return null;
	}
	
	public Billing updateUserBill(Billing userBill)
	{
		return repo.save(userBill);
	}
	
	public Billing disableOrder(String orderId)
	{
		Optional<Billing> bill =  repo.findById(Long.valueOf(orderId));
		if(bill.get()!=null)
		{
			Billing retBilling = bill.get();
			retBilling.setActive(false);
			return repo.save(retBilling);
		}
		else
		{
			return null;
		}
	}
	
	public void deleteOrder(String orderId)
	{
		repo.deleteById(Long.valueOf(orderId));
	}
}
