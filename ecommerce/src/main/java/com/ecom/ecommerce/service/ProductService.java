package com.ecom.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecommerce.entity.Payment;
import com.ecom.ecommerce.entity.Product;
import com.ecom.ecommerce.repository.PaymentRepository;
import com.ecom.ecommerce.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repo;
	
	public Product createUserProduct(Product product)
	{
		return repo.save(product);
	}
	
	public Product getUserProduct(Long productId)
	{
		Optional<Product> product =  repo.findById(productId);
		if(product.get()!=null)
			return product.get();
		else
			return null;
	}
	
	public Product updateUserProduct(Product product)
	{
		return repo.save(product);
	}
	
	public Product disableProduct(Long orderId)
	{
		Optional<Product> product =  repo.findById(orderId);
		if(product.get()!=null)
		{
			Product toRetProduct = product.get();
			toRetProduct.setActive(false);
			return repo.save(toRetProduct);
		}
		else
		{
			return null;
		}
	}
	
	public void deleteProduct(Long orderId)
	{
		repo.deleteById(orderId);
	}
}
