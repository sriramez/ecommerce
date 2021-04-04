package com.ecom.ecommerce.entity;
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
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String streetname1;
	private String streetname2;
	private String district;
	private String state;
	private String pin;
	private String country;
	private Long createdAt;
	private Long editedAt;
	private boolean isActive;
	private int addressType;
	private boolean isDefaultBillingAddress;
	private boolean isDefaultShippingAddress;
	private boolean isProfileAddress;
	@ManyToOne
	@JoinColumn(name="userId", nullable=false)
	@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
	@JsonIdentityReference(alwaysAsId=true) // otherwise first ref as POJO, others as id
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setDefaultBillingAddress(boolean isDefaultBillingAddress) {
		this.isDefaultBillingAddress = isDefaultBillingAddress;
	}
	public void setDefaultShippingAddress(boolean isDefaultShippingAddress) {
		this.isDefaultShippingAddress = isDefaultShippingAddress;
	}
	public int getAddressType() {
		return addressType;
	}
	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}
	public boolean isDefaultBillingAddress() {
		return isDefaultBillingAddress;
	}
	public void setDefaultAddress(boolean isDefaultBillingAddress) {
		this.isDefaultBillingAddress = isDefaultBillingAddress;
	}
	public boolean isDefaultShippingAddress() {
		return isDefaultShippingAddress;
	}
	public boolean isProfileAddress() {
		return isProfileAddress;
	}
	public void setProfileAddress(boolean isProfileAddress) {
		this.isProfileAddress = isProfileAddress;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreetname1() {
		return streetname1;
	}
	public void setStreetname1(String streetname1) {
		this.streetname1 = streetname1;
	}
	public String getStreetname2() {
		return streetname2;
	}
	public void setStreetname2(String streetname2) {
		this.streetname2 = streetname2;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public void setEditedAt(Long deletedAt) {
		this.editedAt = deletedAt;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
