package com.mindtree.customerservicemanagement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class Customer implements Serializable {

	private static final long serialversionUID = 129348938L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private long customerid;

	@Column(name = "customer_name")
	private String customername;

	@Column(name = "customer_contact_number")
	private long contactnumber;

	@Column(name = "email_id")
	private String emailid;

	@Column(name = "area")
	private String area;

	@Column(name = "address1")
	private String addr1;

	@Column(name = "address2")
	private String addr2;

	@Column(name = "customer_pincode")
	private long pincode;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long customerid, String customername, long contactnumber, String emailid, String area, String addr1,
			String addr2, long pincode) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.contactnumber = contactnumber;
		this.emailid = emailid;
		this.area = area;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.pincode = pincode;
	}

	public Customer(int customerid2, String customername2, String string, String emailid2, String area2, String addr12,
			String addr22, int pincode2) {
		// TODO Auto-generated constructor stub
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}

	public long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

}
