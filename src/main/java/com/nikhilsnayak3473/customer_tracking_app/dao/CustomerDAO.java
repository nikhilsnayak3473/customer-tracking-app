package com.nikhilsnayak3473.customer_tracking_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nikhilsnayak3473.customer_tracking_app.dto.Customer;

@Repository
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
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(customer);
		entityTransaction.commit();

	}

	public Customer getCustomer(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		return entityManager.find(Customer.class, id);

	}

	public void deleteCustomer(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Customer customer = entityManager.find(Customer.class, id);

		entityTransaction.begin();
		entityManager.remove(customer);
		entityTransaction.commit();
	}

}
