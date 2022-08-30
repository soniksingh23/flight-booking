package com.flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer fid;
	
	//@NotBlank(message = "Role cannot be blank#######")
	private String role;

	@Override
	public String toString() {
		return "FlightEntity [fid=" + fid + ", role=" + role + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}

