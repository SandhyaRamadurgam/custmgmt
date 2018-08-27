package com.mindtree.customerservicemanagement.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mindtree.customerservicemanagement.model.Customer;


public interface CustomerRepository{
	Customer getCustomerDetailsbyID(Long customerid);
    

}
