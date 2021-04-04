package com.ecom.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecommerce.entity.Payment;
import com.ecom.ecommerce.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository repo;
	
	public Payment createUserPayment(Payment payment)
	{
		return repo.save(payment);
	}
	
	public Payment getUserPayment(String orderId)
	{
		Optional<Payment> payment =  repo.findById(Long.valueOf(orderId));
		if(payment.get()!=null)
			return payment.get();
		else
			return null;
	}
	
	public Payment updateUserBill(Payment payment)
	{
		return repo.save(payment);
	}
	
	public Payment disableOrder(String orderId)
	{
		Optional<Payment> payment =  repo.findById(Long.valueOf(orderId));
		if(payment.get()!=null)
		{
			Payment toRetPayment = payment.get();
			toRetPayment.setActive(false);
			return repo.save(toRetPayment);
		}
		else
		{
			return null;
		}
	}
	
	public void deletePayment(String orderId)
	{
		repo.deleteById(Long.valueOf(orderId));
	}
}
