/**
 * 
 */
package com.zensar.controler;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.model.UserAddressDetails;
import com.zensar.model.UserDetails;
import com.zensar.service.UserService;

/**
 * @author Training
 *
 */
@RestController
public class UserControler {
	@Autowired
	UserService userService;
	@RequestMapping(method = RequestMethod.GET, value="/hello")
	public String helloUser(){
		return "Hi..";
	}

	@PostMapping(value="/createUser")
	public UserDetails createUser(@RequestBody UserDetails userDetails) {
		System.out.println(":::::::::::userDetails:::::::::::" + userDetails);
		System.out.println(":::::::::::UserAddressDetails:::::::::::" + userDetails.getUserAddressDetails());
		return userService.createUser(userDetails);
	}

	@GetMapping(value="/getAllUsers")
	public Iterable<UserDetails> getAllUsers() {
		return userService.getAllUsers();
	}

	/*@RequestMapping :  is the alternate way: we can use @GetMapping instead of it*/
	@RequestMapping(value="/getUser/{id}",method=RequestMethod.GET)
	public Optional<UserDetails> getUserById(@PathVariable("id") Long userId) {
		return userService.getUserById(userId);
	}

	//@RequestMapping(value="/getEmployee/{id}",method=RequestMethod.DELETE)
	@DeleteMapping(value="/getUser/{id}")
	public void deletUser(@PathVariable("id") Long id) {
		userService.deletUser(id);
	}

	//@RequestMapping(value="/getEmployee/{id}",method=RequestMethod.PUT)
	@PutMapping(value="/getUser/{id}")
	public UserDetails updateUser(@PathVariable("id") Long userId, @RequestBody UserDetails userDetails) {
		//return userService.updateUser(userId,userDetails);
		return null;
	}

	@GetMapping(value="/getUser/name/{name}")
	public List<UserDetails> getUserByName(@PathVariable("name") String name) {
		return userService.getUserByName(name);
	}
}
