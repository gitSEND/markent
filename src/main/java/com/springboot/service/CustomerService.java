package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.entity.Customer;

public interface CustomerService {

	Customer saverOrUpdate(Customer customer);

	List<Customer> getAll() throws Exception;

	Optional<Customer> getById(Long id);
	
	

}
