package com.ecom.ecommerce.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserCartDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long userCartDetailsId;
	int quantity;
	
	@JoinColumn(name ="productId",nullable = false)
	@ManyToOne
	Product products;
	
	public Product getProducts() {
		return products;
	}
	public void setProducts(Product products) {
		this.products = products;
	}
	public Long getUserCartDetailsId() {
		return userCartDetailsId;
	}
	public void setUserCartDetailsId(Long userCartDetailsId) {
		this.userCartDetailsId = userCartDetailsId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
