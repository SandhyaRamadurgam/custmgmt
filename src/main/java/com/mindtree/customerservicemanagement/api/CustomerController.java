package com.mindtree.customerservicemanagement.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.customerservicemanagement.model.Customer;
import com.mindtree.customerservicemanagement.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;

	@Cacheable(value = "Customer", key = "#customerid")
	@GetMapping("/{customerid}")
	public ResponseEntity<Customer> getCustomerDetails(@PathVariable long customerid) {		
		return new ResponseEntity<Customer>(customerservice.getCustomerDetails(customerid),HttpStatus.OK);
	}

}
