package com.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Customer;
import com.springboot.repository.CustomerRepository;
import com.springboot.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository dao;

	@Override
	public Customer saverOrUpdate(Customer customer) {

		return dao.save(customer);
	}

	@Override
	public List<Customer> getAll() throws Exception {

		return dao.findAll();
	}

	@Override
	public Optional<Customer> getById(Long id) {

		return dao.findById(id);
	}

	
}
