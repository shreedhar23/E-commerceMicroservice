package com.learn.microservices.ecommerce.customer;

import org.springframework.data.repository.CrudRepository;

import com.learn.microservices.ecommerce.customer.model.Customer;
import com.sun.xml.bind.v2.model.core.ID;

public interface CustomerServiceDAO extends CrudRepository<Customer, ID> {

}
