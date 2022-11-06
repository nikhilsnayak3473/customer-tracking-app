package com.nikhilsnayak3473.customer_tracking_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhilsnayak3473.customer_tracking_app.dao.CustomerDAO;
import com.nikhilsnayak3473.customer_tracking_app.dto.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
	}

	public Customer getCustomer(int id) {
		return customerDAO.getCustomer(id);
	}

	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);

	}

}
