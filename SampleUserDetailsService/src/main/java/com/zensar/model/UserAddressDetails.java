/**
 * 
 */
package com.zensar.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Training
 *
 */
@Entity
@Table(name="USER_ADDRESS_DETAILS", schema="INFORMATION_SCHEMA")
public class UserAddressDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADDRESS_ID")
	private Long addressId;

	@Column(name="ADDRESS_LINE_ONE")
	private String addressLineOne;

	@Column(name="ADDRESS_LINE_TWO")
	private String addressLineTwo;

	@Column(name="CITY")
	private String city;

	@Column(name="STATE")
	private String state;

	@Column(name="PIN_CODE")
	private String pinCode;

	@Column(name="COUNTRY")
	private String country;



	/*WORKING CODE*/
	/*@OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ADDRESS_USER_ID",insertable=true)*?/
	/*@ManyToOne
	 @JoinColumn(name = "USER_ID", updatable=false ,insertable = true)*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS_USER_ID", updatable = false, insertable = true)
	private UserDetails userDetail;

	/**
	 * 
	 */
	public UserAddressDetails() {

	}

	/**
	 * @param addressId
	 * @param addressLineOne
	 * @param addressLineTwo
	 * @param city
	 * @param state
	 * @param pinCode
	 * @param country
	 * @param userDetails
	 */
	public UserAddressDetails(Long addressId, String addressLineOne, String addressLineTwo, String city, String state,
			String pinCode, String country, UserDetails userDetails) {
		this.addressId = addressId;
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
		this.userDetail = userDetails;
	}

	/**
	 * @return the addressId
	 */
	public Long getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the addressLineOne
	 */
	public String getAddressLineOne() {
		return addressLineOne;
	}

	/**
	 * @param addressLineOne the addressLineOne to set
	 */
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	/**
	 * @return the addressLineTwo
	 */
	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	/**
	 * @param addressLineTwo the addressLineTwo to set
	 */
	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the userDetails
	 */
	public UserDetails getUserDetails() {
		return userDetail;
	}

	/**
	 * @param userDetails the userDetails to set
	 */
	public void setUserDetails(UserDetails userDetails) {
		this.userDetail = userDetails;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserAddressDetails [addressId=" + addressId + ", addressLineOne=" + addressLineOne + ", addressLineTwo="
				+ addressLineTwo + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", country="
				+ country + ", userDetails=" + userDetail + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressId == null) ? 0 : addressId.hashCode());
		result = prime * result + ((addressLineOne == null) ? 0 : addressLineOne.hashCode());
		result = prime * result + ((addressLineTwo == null) ? 0 : addressLineTwo.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((pinCode == null) ? 0 : pinCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((userDetail == null) ? 0 : userDetail.hashCode());
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
		UserAddressDetails other = (UserAddressDetails) obj;
		if (addressId == null) {
			if (other.addressId != null)
				return false;
		} else if (!addressId.equals(other.addressId))
			return false;
		if (addressLineOne == null) {
			if (other.addressLineOne != null)
				return false;
		} else if (!addressLineOne.equals(other.addressLineOne))
			return false;
		if (addressLineTwo == null) {
			if (other.addressLineTwo != null)
				return false;
		} else if (!addressLineTwo.equals(other.addressLineTwo))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (pinCode == null) {
			if (other.pinCode != null)
				return false;
		} else if (!pinCode.equals(other.pinCode))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (userDetail == null) {
			if (other.userDetail != null)
				return false;
		} else if (!userDetail.equals(other.userDetail))
			return false;
		return true;
	}




}
