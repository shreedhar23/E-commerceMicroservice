/**
 * 
 */
package com.learn.microservices.ecommerce.customer.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Mallige
 *
 */
@Entity
@Table(name="CUSTOMER_DETAILS")
public @Data class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerFirstName;
	private String CustomerLastName;
	private Date dateOfBirth;
	@OneToMany(mappedBy = "customerDetails", cascade = CascadeType.ALL)
    private Set<Address> address;

}
