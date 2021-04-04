package com.ecom.ecommerce.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class UserCarts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long cartId;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cartId")
	@NotFound(action=NotFoundAction.IGNORE)
	List<UserCartDetails> cartDetails; // not a column in table.
	
	@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
	@JsonIdentityReference(alwaysAsId=true) // otherwise first ref as POJO, others as id
	@ManyToOne
	@JoinColumn(name="userId",nullable = false)
	User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	int cartType;

	public int getCartType() {
		return cartType;
	}

	public void setCartType(int cartType) {
		this.cartType = cartType;
	}

	public List<UserCartDetails> getCartDetails() {
		return cartDetails;
	}

	public void setCartDetails(List<UserCartDetails> cartDetails) {
		this.cartDetails = cartDetails;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}


}
