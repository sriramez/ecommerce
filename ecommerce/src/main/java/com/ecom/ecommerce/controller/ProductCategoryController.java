package com.ecom.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecommerce.entity.ProductCategories;
import com.ecom.ecommerce.service.ProductCategoryService;

@RestController
public class ProductCategoryController {

	@Autowired 
	ProductCategoryService pcService;
	
	@PostMapping("/productcategories")
	public ProductCategories addCategory(@RequestBody ProductCategories productCategory) {
		return pcService.save(productCategory);
	}
	
	@GetMapping("/productcategories")
	public List<ProductCategories> getProductCategories() {
		return pcService.findAll();
	}

}
