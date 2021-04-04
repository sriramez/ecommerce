package com.ecom.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecommerce.entity.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long>{

}
