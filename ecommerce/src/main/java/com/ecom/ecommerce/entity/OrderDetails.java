package com.ecom.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long productid;
	
	private String shippingaddress;
	
	private Integer actualprice;
	
	private Integer disountedPrice;
	
	@JsonIgnoreProperties("details")
	@ManyToOne
	@JoinColumn(name="orderId",nullable = false)
	UserOrder userOrder;


	public UserOrder getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(UserOrder userOrder) {
		this.userOrder = userOrder;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public String getShippingaddress() {
		return shippingaddress;
	}

	public void setShippingaddress(String shippingaddress) {
		this.shippingaddress = shippingaddress;
	}

	public Integer getActualprice() {
		return actualprice;
	}

	public void setActualprice(Integer actualprice) {
		this.actualprice = actualprice;
	}

	public Integer getDisountedPrice() {
		return disountedPrice;
	}

	public void setDisountedPrice(Integer disountedPrice) {
		this.disountedPrice = disountedPrice;
	}
	
	
}
