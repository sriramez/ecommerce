package com.ecom.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	private int price;
	private String currency;
	private int quantity;
	private int discount;
	private boolean cashApplicable;
	private Long createdAt;
	private Long editedAt;
	private boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="editedBy",nullable = false)
	User editedBy;
	
	@ManyToOne
	@JoinColumn(name="createdBy",nullable = false)
	User createdBy;
	
	@ManyToOne
	@JoinColumn(name ="productCategoryId",nullable = false)
	ProductCategories productCategories;
	
	
	public ProductCategories getProductCategories() {
		return productCategories;
	}
	public void setProductCategories(ProductCategories productCategories) {
		this.productCategories = productCategories;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public boolean isCashApplicable() {
		return cashApplicable;
	}
	public void setCashApplicable(boolean cashApplicable) {
		this.cashApplicable = cashApplicable;
	}
	public Long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	public Long getEditedAt() {
		return editedAt;
	}
	public void setEditedAt(Long editedAt) {
		this.editedAt = editedAt;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public User getEditedBy() {
		return editedBy;
	}
	public void setEditedBy(User editedBy) {
		this.editedBy = editedBy;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
}
