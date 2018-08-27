package com.mindtree.customerservicemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.mindtree.customerservicemanagement.model.Customer;
import com.mindtree.customerservicemanagement.repository.CustomerRepository;
import com.mindtree.customerservicemanagement.repository.CustomerRepositoryImplementation;

@Service
public class CustomerServiceImplemetation implements CustomerService {

	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer getCustomerDetails(long customerid) {
		return repo.getCustomerDetailsbyID(customerid);
	}

}
