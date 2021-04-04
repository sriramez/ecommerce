package com.ecom.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecommerce.entity.Product;
import com.ecom.ecommerce.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product)
	{
		return productService.createUserProduct(product);
	}
	
	@PutMapping
	public Product editProduct(@RequestBody Product product)
	{
		return productService.createUserProduct(product);
	}
	
	@GetMapping
	public Product getProduct(@RequestParam Long productId)
	{
		return productService.getUserProduct(productId);
	}
	
	@DeleteMapping("disable")
	public Product disableProduct(@RequestParam Long productId)
	{
		return productService.disableProduct(productId);
	}
	
	@DeleteMapping
	public Product deleteProduct(@RequestParam Long productId)
	{
		productService.deleteProduct(productId);
		Product prod = new Product();
		prod.setId(productId);
		return prod;
	}
}
