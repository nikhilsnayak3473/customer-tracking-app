package com.nikhilsnayak3473.customer_tracking_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nikhilsnayak3473.customer_tracking_app.dto.Customer;
import com.nikhilsnayak3473.customer_tracking_app.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customer-list")
	public ModelAndView customerList() {
		ModelAndView modelAndView = new ModelAndView("customer-list.jsp");

		List<Customer> customers = customerService.getCustomers();

		modelAndView.addObject("customers", customers);

		return modelAndView;
	}

}
