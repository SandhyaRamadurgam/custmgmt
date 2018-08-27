package com.mindtree.customerservicemanagment.service;


import org.junit.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.mindtree.customerservicemanagement.model.Customer;
import com.mindtree.customerservicemanagement.service.CustomerServiceImplemetation;

public class CustomerServiceTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CustomerServiceImplemetation csi;

	@Test
	public void getCustomerDetails() throws Exception {
		Customer cust = new Customer(1, "ABC", 123456789, "abc@gmail.com", "blr", "abc", "xyz", 560012);
		Mockito.when(csi.getCustomerDetails(1)).thenReturn(cust);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/customer/{1}").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		System.out.println("ABCD" + result.getResponse().getContentAsString());
		String str = "{\"customerid\":1,\"customername\":\"ABC\",\"contactnumber\":123456789,\"emailid\":\"abc@gmail.com\",\"area\":\"blr\",\"addr1\":\"abc\",\"addr2\":\"xyz\",\"pincode\":560012}";
		JSONAssert.assertEquals(str, result.getResponse().getContentAsString(), false);
	}

}
