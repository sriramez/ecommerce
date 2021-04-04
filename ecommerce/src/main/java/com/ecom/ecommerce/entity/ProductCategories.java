package com.ecom.ecommerce.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class ProductCategories {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	@Column(unique = true)
	private String categoryName;
	
	private Long createdAt;
	private Long editedAt;
	private boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="createdBy",nullable = false)
	private User createdBy;
	
	@ManyToOne
	@JoinColumn(name="editedBy",nullable = false)
	private User editedBy;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public User getEditedBy() {
		return editedBy;
	}
	public void setEditedBy(User editedBy) {
		this.editedBy = editedBy;
	}
}
