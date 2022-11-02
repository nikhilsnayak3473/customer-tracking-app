package com.nikhilsnayak3473.customer_tracking_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nikhilsnayak3473.customer_tracking_app.dto.Customer;

@Component
public class CustomerDAO {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@SuppressWarnings("unchecked")
	public List<Customer> getCustomers() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select customer from Customer customer");

		List<Customer> customers = query.getResultList();
		return customers;
	}

	public void saveCustomer(Customer customer) {

	}

	public void getCustomer(int id) {

	}

}
