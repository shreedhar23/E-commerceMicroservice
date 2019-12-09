/**
 * 
 *//*
package com.zensar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

*//**
 * @author Training
 *
 *//*
@Entity
@Table(name="user_details", schema="INFORMATION_SCHEMA")
public class User {
	@Id
    @GeneratedValue
    @Column(name="user_id")
    private Long user_Id;
	@Column(name="user_first_Name")
    private String userFirstName;
	@Column(name="user_Last_Name")
    private String userLastName;
	@Column(name="city")
    private String city;
	@Column(name="state")
    private String state;
	@Column(name="pinCode")
    private String pinCode;
	
	 (non-Javadoc)
	 * @see java.lang.Object#toString()
	 
	@Override
	public String toString() {
		return "User [user_Id=" + user_Id + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	 (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((pinCode == null) ? 0 : pinCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((userFirstName == null) ? 0 : userFirstName.hashCode());
		result = prime * result + ((userLastName == null) ? 0 : userLastName.hashCode());
		result = prime * result + ((user_Id == null) ? 0 : user_Id.hashCode());
		return result;
	}
	 (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
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
		if (userFirstName == null) {
			if (other.userFirstName != null)
				return false;
		} else if (!userFirstName.equals(other.userFirstName))
			return false;
		if (userLastName == null) {
			if (other.userLastName != null)
				return false;
		} else if (!userLastName.equals(other.userLastName))
			return false;
		if (user_Id == null) {
			if (other.user_Id != null)
				return false;
		} else if (!user_Id.equals(other.user_Id))
			return false;
		return true;
	}
	*//**
	 * @return the user_Id
	 *//*
	public Long getUser_Id() {
		return user_Id;
	}
	*//**
	 * @param user_Id the user_Id to set
	 *//*
	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}
	*//**
	 * @return the userFirstName
	 *//*
	public String getUserFirstName() {
		return userFirstName;
	}
	*//**
	 * @param userFirstName the userFirstName to set
	 *//*
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	*//**
	 * @return the userLastName
	 *//*
	public String getUserLastName() {
		return userLastName;
	}
	*//**
	 * @param userLastName the userLastName to set
	 *//*
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	*//**
	 * @return the city
	 *//*
	public String getCity() {
		return city;
	}
	*//**
	 * @param city the city to set
	 *//*
	public void setCity(String city) {
		this.city = city;
	}
	*//**
	 * @return the state
	 *//*
	public String getState() {
		return state;
	}
	*//**
	 * @param state the state to set
	 *//*
	public void setState(String state) {
		this.state = state;
	}
	*//**
	 * @return the pinCode
	 *//*
	public String getPinCode() {
		return pinCode;
	}
	*//**
	 * @param pinCode the pinCode to set
	 *//*
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	

}
*/