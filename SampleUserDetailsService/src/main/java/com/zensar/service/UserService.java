/**
 * 
 */
package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.dao.UserDAO;
import com.zensar.model.UserDetails;

/**
 * @author Training
 *
 */
@Service
public class UserService {
	@Autowired
	UserDAO userDAO;
	public UserDetails createUser(UserDetails userDetails) {
		// TODO Auto-generated method stub
		return userDAO.save(userDetails);
	}
	public  Iterable<UserDetails> getAllUsers() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}
	
	public Optional<UserDetails> getUserById(Long userId) {
		return userDAO.findById(userId);
	}
	
	public void deletUser(Long userId) {
		userDAO.deleteById(userId);
	}
	
	/*public UserDetails updateUser(Long userId, @RequestBody UserDetails userDetails) {
		Optional<UserDetails> optionalUserDetails =  userDAO.findById(userId);
		UserDetails userDetail = optionalUserDetails.get();
		userDetail.setUserAddress(userDetails.getUserAddressDetails());
		userDetail.setDateOfBirth(userDetails.getDateOfBirth());
		userDetail.setUserFirstName(userDetails.getUserFirstName());
		userDetail.setUserLastName(userDetails.getUserLastName());
		return userDAO.save(userDetail);
	}*/
	
	public List<UserDetails> getUserByName(String name) {
		return userDAO.getUserByName(name);
	}

}
