package com.nikhilsnayak3473.customer_tracking_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nikhilsnayak3473.customer_tracking_app.dto.Customer;
import com.nikhilsnayak3473.customer_tracking_app.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/customer-list")
	public String customerList(Model model) {

		List<Customer> customers = customerService.getCustomers();

		model.addAttribute("customers", customers);

		return "customer-list";
	}

	@GetMapping("/register")
	public String showCustomerRegisterForm(Model model) {

		model.addAttribute("customer", new Customer());

		return "customer-form";
	}

	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);

		return "redirect:/customer-list";
	}

	@GetMapping("/update")
	public String showCustomerupdateForm(@RequestParam("id") int id, Model model) {

		Customer customer = customerService.getCustomer(id);

		model.addAttribute("customer", customer);

		return "customer-form";

	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("id") int id) {

		customerService.deleteCustomer(id);

		return "redirect:/customer-list";

	}

}
