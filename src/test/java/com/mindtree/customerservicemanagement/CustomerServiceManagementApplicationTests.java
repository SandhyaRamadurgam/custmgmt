package com.mindtree.customerservicemanagement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.mindtree.customerservicemanagement.api.CustomerController;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CustomerController.class, secure = false)
public class CustomerServiceManagementApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private CustomerController custcontroller;
	
	

}
