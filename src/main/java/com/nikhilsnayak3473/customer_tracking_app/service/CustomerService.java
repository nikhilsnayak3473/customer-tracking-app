package com.nikhilsnayak3473.customer_tracking_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nikhilsnayak3473.customer_tracking_app.dao.CustomerDAO;
import com.nikhilsnayak3473.customer_tracking_app.dto.Customer;

@Component
public class CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

}
