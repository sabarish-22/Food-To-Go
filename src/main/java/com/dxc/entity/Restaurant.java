package com.dxc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Restaurant")
public class Restaurant {
	
	@Id
	@GeneratedValue
	@Column(name="Restid")
	private Long Restid;
	
	@Column(name="Restname")
	private String Restname;
	
	@Column(name="email")
	private String email;

	
	public Long getRestid() {
		return Restid;
	}

	public void setRestid(Long restid) {
		Restid = restid;
	}

	public String getRestname() {
		return Restname;
	}

	public void setRestname(String restname) {
		Restname = restname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
