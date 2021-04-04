
package com.ecom.ecommerce.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecommerce.constants.Constants;
import com.ecom.ecommerce.entity.Address;
import com.ecom.ecommerce.service.AddressService;

@RestController

@RequestMapping("user")
public class AddresssController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("/addresses")
	public Address saveUserAddress(@RequestBody Address address) {
		return addressService.createUpdateAddress(address);
	}
	
	@GetMapping("/{userId}/addresses")
	public List<Address> getUserAddresses(@PathVariable("userId") long userId,
		@RequestParam(required = false) Integer type) {
		if (type == null) {
			return addressService.getAllUserAddresses(userId);
		}
		switch (type) {
		case Constants.UserAddressTypes.DEFAULT_BILLING_ADDRESS:
			return Arrays.asList(addressService.getUserDefaultBillingAddress(userId));
		case Constants.UserAddressTypes.DEFAULT_SHIPPING_ADDRESS:
			return Arrays.asList(addressService.getUserDefaultShippingAddress(userId));
		default:
			return addressService.getAllUserAddresses(userId);
		}
	}


//	URL GET TEMPLATE-/user/<user-id>/addresses?type=<1/2/3>.
//	If no param supplied, by default, returns all addresses.

//	TODO-VALIDATION-
//		* User can have only 1 default address and 1 default shipping address
//		* Request Param regex validation?

}