package com.ecom.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecommerce.entity.ProductCategories;

@Repository
public interface ProductCategoryRepository extends CrudRepository<ProductCategories, Long>{

}
