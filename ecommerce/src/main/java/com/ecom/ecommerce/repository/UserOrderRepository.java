package com.ecom.ecommerce.repository;

import org.springframework.stereotype.Repository;

import com.ecom.ecommerce.entity.User;
import com.ecom.ecommerce.entity.UserOrder;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserOrderRepository extends CrudRepository<UserOrder,Long>{

	List<UserOrder> findByUser(User id);
}
