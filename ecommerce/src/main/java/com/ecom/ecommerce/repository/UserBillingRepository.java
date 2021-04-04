package com.ecom.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecommerce.entity.Billing;

@Repository
public interface UserBillingRepository extends CrudRepository<Billing, Long>{

}
