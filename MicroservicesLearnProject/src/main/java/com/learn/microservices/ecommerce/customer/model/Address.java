/**
 * 
 */
package com.learn.microservices.ecommerce.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Mallige
 *
 */
@Entity
@Table(name="ADDRESS_DETAILS")
public @Data class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	private String address1;
	private String address2;
	private String city;
	private String zipCode;
	@ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customerAddress;

}
