/**
 * 
 */
package com.learn.microservices.ecommerce.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservices.ecommerce.customer.model.Customer;

/**
 * @author Mallige
 *
 */
@RestController
public class CustomerController {
	@Autowired
	CustomerService customerServices;

	@RequestMapping(value = "/sayHiCustomer", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public String sayHi() {
		System.out.println("Inside say hi");
		return "Hi";
	}

	@PostMapping(value = "/customer/createCustomer", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createCustomer(@RequestBody Customer customer) {
		System.out.println("Inside createCustomer");
		return customerServices.createCustomer(customer);
		// return "Hi";
	}

	@GetMapping(value="/customer/getAllCustomer",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomer() {
		return customerServices.getAllCustomer();
	}

	@GetMapping(value= "/customer/getCustomer/{id}")
	public Customer getCustomer(@PathVariable long id) {
		Optional<Customer> customer = customerServices.getCustomer(id);

		/*
		 * if (!customer.isPresent()) throw new StudentNotFoundException("id-" +
		 * id);
		 */

		return customer.get();
	}

	@DeleteMapping("/Customer/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable long id) {
		customerServices.deleteCustomer(id);
	}

	@PutMapping("/Customer/updateCustomer/{id}")
	public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer, @PathVariable long id) {

		return customerServices.updateCustomer(customer, id);

	}
}
