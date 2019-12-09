/**
 * 
 */
package com.zensar.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Training
 *
 */
@Entity
@Table(name="USER_DETAILS", schema="INFORMATION_SCHEMA")
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="USER_ID")
    private Long userId;
	
	@Column(name="USER_FIRST_NAME")
    private String userFirstName;
	
	@Column(name="USER_LAST_NAME")
	private String userLastName;
	
	@Column(name="DATE_OF_BIRTH")
    private Date dateOfBirth;
	
	//@OneToMany(mappedBy = "userDetail", cascade = CascadeType.ALL)
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "ADDRESS_USER_ID")
	private Set<UserAddressDetails> userAddressDetails;
	
	/*WORKING CODE*/
	/*@OneToOne(fetch = FetchType.EAGER, mappedBy="userDetail",cascade = CascadeType.ALL)
	private UserAddressDetails userAddressDetails;*/

	/**
	 * 
	 */
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userId
	 * @param userFirstName
	 * @param userLastName
	 * @param dateOfBirth
	 * @param userAddressDetails
	 */
	public UserDetails(Long userId, String userFirstName, String userLastName, Date dateOfBirth,
			Set<UserAddressDetails> userAddressDetails) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.dateOfBirth = dateOfBirth;
		this.userAddressDetails = userAddressDetails;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the userFirstName
	 */
	public String getUserFirstName() {
		return userFirstName;
	}

	/**
	 * @param userFirstName the userFirstName to set
	 */
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	/**
	 * @return the userLastName
	 */
	public String getUserLastName() {
		return userLastName;
	}

	/**
	 * @param userLastName the userLastName to set
	 */
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the userAddressDetails
	 */
	public Set<UserAddressDetails> getUserAddressDetails() {
		return userAddressDetails;
	}

	/**
	 * @param userAddressDetails the userAddressDetails to set
	 */
	public void setUserAddressDetails(Set<UserAddressDetails> userAddressDetails) {
		this.userAddressDetails = userAddressDetails;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", dateOfBirth=" + dateOfBirth + ", userAddressDetails=" + userAddressDetails + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((userAddressDetails == null) ? 0 : userAddressDetails.hashCode());
		result = prime * result + ((userFirstName == null) ? 0 : userFirstName.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userLastName == null) ? 0 : userLastName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetails other = (UserDetails) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (userAddressDetails == null) {
			if (other.userAddressDetails != null)
				return false;
		} else if (!userAddressDetails.equals(other.userAddressDetails))
			return false;
		if (userFirstName == null) {
			if (other.userFirstName != null)
				return false;
		} else if (!userFirstName.equals(other.userFirstName))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userLastName == null) {
			if (other.userLastName != null)
				return false;
		} else if (!userLastName.equals(other.userLastName))
			return false;
		return true;
	}
	
	
}
