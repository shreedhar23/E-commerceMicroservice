/**
 * 
 */
package com.learn.microservices.ecommerce.customer;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mallige
 *
 */
@RestController
public class CustomerServiceController {
	@RequestMapping(value = "/sayHiCustomer", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public String sayHi() 
	{
	    System.out.println("Inside say hi");
	    return "Hi";
	}
}
