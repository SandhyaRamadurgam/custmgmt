package com.mindtree.customerservicemanagement.repository;


import javax.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.customerservicemanagement.model.Customer;

@Repository
public class CustomerRepositoryImplementation implements CustomerRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public Customer getCustomerDetailsbyID(Long customerid) {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Customer cust = (Customer) session.get(Customer.class, customerid);
		return cust;
	}

}
