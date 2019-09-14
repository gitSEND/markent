package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.entity.Customer;
import com.springboot.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping("/list")
	public String listCustomers(Model model) {
		try {
			model.addAttribute("customers", service.getAll());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "index";
	}

	@GetMapping("/new")
	public String newCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer";
	}

	@PostMapping("/save")
	public String guardarCustomer(Customer customer) {
		try {
			service.saverOrUpdate(customer);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/customers/list";
	}
}
