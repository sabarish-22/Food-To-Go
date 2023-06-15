package com.dxc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue
	private Long restaurantId;

	private String restaurantName;

	private String email;

	/**
	 * @return the restaurantId
	 */
	public Long getRestaurantId() {
		return restaurantId;
	}

	/**
	 * @return the restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param restaurantId the restaurantId to set
	 */
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	/**
	 * @param restaurantName the restaurantName to set
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
