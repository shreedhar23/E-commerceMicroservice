/**
 * 
 */
package com.zensar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.model.UserDetails;

/**
 * @author Training
 *
 */
@Repository
public interface UserDAO extends CrudRepository<UserDetails, Long>{
	
	@Query (value = "SELECT * FROM USER_DETAILS  WHERE NAME = ?1", nativeQuery = true)
	public List<UserDetails> getUserByName(String name);

}
