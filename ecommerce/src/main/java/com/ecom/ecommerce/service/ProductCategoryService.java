package com.ecom.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecommerce.entity.ProductCategories;
import com.ecom.ecommerce.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {
@Autowired
ProductCategoryRepository repo;

	public ProductCategories save(ProductCategories productCategory) {
		return repo.save(productCategory);
	}
	
	public List<ProductCategories> findAll() {
		return (List) repo.findAll();
	}

}
