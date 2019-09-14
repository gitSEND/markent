package com.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Optional<Customer> findByDni(String dni);

	@Query("select c from Customer c where c.dni=?1")
	List<Customer> getByDni(String dni);

	@Query(value = "SELECT * FROM customers WHERE dni=?1", nativeQuery = true)
	List<Customer> fecthByDni(String dni);
}
